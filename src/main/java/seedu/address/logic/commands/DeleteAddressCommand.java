package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.parser.Prefix;
import seedu.address.model.Model;
import seedu.address.model.person.Person;

/**
 * Deletes the person's public address identified by the index number
 * used in the displayed person list and their crypto network.
 */
public class DeleteAddressCommand extends Command {
    public static final Prefix PREFIX_NETWORK = new Prefix("c/"); //#TODO: Placeholder
    public static final String COMMAND_WORD = "dela"; // short for delete address

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Deletes the person's public address identified by the index number "
            + "used in the displayed person list and their crypto network.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + PREFIX_NETWORK + "Network"
            + "Example: " + COMMAND_WORD + " 1 " + PREFIX_NETWORK + "BTC";

    public static final String MESSAGE_DELETE_PERSON_SUCCESS = "Deleted Person's Address: %1$s";

    private final Index targetIndex;

    public DeleteAddressCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Person> lastShownList = model.getFilteredPersonList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        }

        Person personToDelete = lastShownList.get(targetIndex.getZeroBased());
        model.deletePerson(personToDelete);
        return new CommandResult(String.format(MESSAGE_DELETE_PERSON_SUCCESS, Messages.format(personToDelete)));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof DeleteAddressCommand otherDeleteCommand)) {
            return false;
        }

        return targetIndex.equals(otherDeleteCommand.targetIndex);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("targetIndex", targetIndex)
                .toString();
    }
}
