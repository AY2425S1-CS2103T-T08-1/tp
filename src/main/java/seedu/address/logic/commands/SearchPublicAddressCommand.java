package seedu.address.logic.commands;


import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;
import static seedu.address.commons.util.StringUtil.INDENT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PUBLIC_ADDRESS;
import static seedu.address.model.addresses.PublicAddress.MESSAGE_SEARCH_PUBLIC_ADDRESS_SUCCESS_NOT_FOUND;
import static seedu.address.model.addresses.PublicAddress.validatePublicAddress;

import java.util.List;

import seedu.address.model.Model;
import seedu.address.model.addresses.PublicAddressesComposition;
import seedu.address.model.person.Person;


/**
 * Changes the searchPublicAddress of an existing person in the address book.
 */
public class SearchPublicAddressCommand extends Command {

    public static final String COMMAND_WORD = "searchpa";

    public static final String MESSAGE_USAGE = COMMAND_WORD
        + ": Searches for a public address and returns the user, network and tag "
        + "throughout all the public addresses of all networks in the address book.\n"
        + "Parameters: PUBLIC_ADDRESS (must be a string) " + PREFIX_PUBLIC_ADDRESS
        + "PUBLIC_ADDRESS\n"
        + "Example: " + COMMAND_WORD + " "
        + PREFIX_PUBLIC_ADDRESS + "0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2";

    public static final String MESSAGE_SEARCH_PUBLIC_ADDRESS_SUCCESS_FOUND = "Successfully found Persons with public "
        + "address inputted: %1$s";

    public static final String MESSAGE_SEARCH_PUBLIC_ADDRESS_SUBSTRING_SUCCESS = "Successfully found Persons with "
        + "public "
        + "address containing the substring inputted:\n%1$s";
    public static final String MESSAGE_SEARCH_PUBLIC_ADDRESS_SUBSTRING_FAIL =
        "Can't find any Person with public address of"
            + " containing the "
            + "public substring inputted:\n%1$s";


    //ETH PA length 42
    //SOL PA length 32-44
    //BTC PA length 26-35
    public static final String MESSAGE_ARGUMENTS = "Public Address: %1$s";


    private final String publicAddressString;

    /**
     * @param publicAddressString of the person to be updated to
     */
    public SearchPublicAddressCommand(String publicAddressString) {
        requireAllNonNull(publicAddressString);


        this.publicAddressString = publicAddressString;


    }

    @Override
    public CommandResult execute(Model model) {

        try {
            validatePublicAddress(publicAddressString);
        } catch (IllegalArgumentException e) {
            return new CommandResult(e.getMessage());
        }

        List<Person> lastShownList = model.getFilteredPersonList();

        List<Person> personsWithPublicAddressMatch = lastShownList.stream()
            .filter(person -> person.hasPublicAddressStringAmongAllNetworks(publicAddressString))
            .toList();

        return generateResult(personsWithPublicAddressMatch);
    }


    /**
     * Generates a Result object success message based on whether
     * success of searching for a public address.
     * {@code personToEdit}.
     */
    private CommandResult generateResult(List<Person> personsWithPublicAddressMatch) {
        String output;
        if (!personsWithPublicAddressMatch.isEmpty()) {
            String message = MESSAGE_SEARCH_PUBLIC_ADDRESS_SUCCESS_FOUND;
            String personsDetails = personsWithPublicAddressMatch.stream()
                .map(person -> person.getName() + "\n" + INDENT + generateStringForPublicAddressesForPersonMap(person,
                    publicAddressString))
                .reduce((a, b) -> a + "\n" + b)
                .orElse("");
            output = String.format(message, publicAddressString.toLowerCase() + "\n" + personsDetails);
        } else {
            String message = MESSAGE_SEARCH_PUBLIC_ADDRESS_SUCCESS_NOT_FOUND;
            output = String.format(message, publicAddressString);
        }
        return new CommandResult(output);


    }

    private String generateStringForPublicAddressesForPersonMap(Person person, String publicAddressString) {
        PublicAddressesComposition mapOfPublicAddresses =
            person.getPublicAddressObjectByPublicAddressMap(publicAddressString);
        return mapOfPublicAddresses.toStringIndented();

    }


    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof SearchPublicAddressCommand e)) {
            return false;
        }

        return publicAddressString.equals(e.publicAddressString);
    }

}
