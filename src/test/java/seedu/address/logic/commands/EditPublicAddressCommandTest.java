package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PUBLIC_ADDRESS_BTC_MAIN;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalPersons.BTC_MAIN_ADDRESS;
import static seedu.address.testutil.TypicalPersons.JOE;

import org.junit.jupiter.api.Test;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.addresses.Network;
import seedu.address.model.addresses.PublicAddressFactory;
import seedu.address.model.person.Person;
import seedu.address.testutil.TypicalPersons;

public class EditPublicAddressCommandTest {

    private static final String VALID_PUBLIC_ADDRESS_1 = "14qViLJfdGaP4EeHnDyJbEGQysnCpwk3gd";
    private static final String VALID_PUBLIC_ADDRESS_2 = "34qViLJfdGaP4EeHnDyJbEGQysnCpwk3gd";

    private final Model model = new ModelManager(TypicalPersons.getTypicalAddressBook(), new UserPrefs());

    @Test
    public void execute_validIndexValidAddress_success() throws Exception {
        model.addPerson(JOE);
        Index index = Index.fromOneBased(model.getFilteredPersonList().size());

        Person personToEdit = model.getFilteredPersonList().get(index.getZeroBased());
        EditPublicAddressCommand editCommand = new EditPublicAddressCommand(index, Network.BTC,
            VALID_PUBLIC_ADDRESS_1,
            BTC_MAIN_ADDRESS.label);

        Model expectedModel = new ModelManager(model.getAddressBook(), new UserPrefs());
        Person editedPerson = personToEdit.withUpdatedPublicAddress(
            PublicAddressFactory.createPublicAddress(Network.BTC, VALID_PUBLIC_ADDRESS_1,
                BTC_MAIN_ADDRESS.label));

        expectedModel.setPerson(personToEdit, editedPerson);

        String expectedMessage = String.format(EditPublicAddressCommand.MESSAGE_SUCCESS,
            Messages.format(editedPerson));

        assertCommandSuccess(editCommand, model, expectedMessage, expectedModel);


        index = Index.fromOneBased(model.getFilteredPersonList().size());

        personToEdit = model.getFilteredPersonList().get(index.getZeroBased());
        editCommand = new EditPublicAddressCommand(index, Network.BTC, VALID_PUBLIC_ADDRESS_BTC_MAIN,
            BTC_MAIN_ADDRESS.label);


        editedPerson = personToEdit.withUpdatedPublicAddress(
            PublicAddressFactory.createPublicAddress(Network.BTC,
                VALID_PUBLIC_ADDRESS_BTC_MAIN, BTC_MAIN_ADDRESS.label));
        expectedModel.setPerson(personToEdit, editedPerson);
        expectedMessage = String.format(EditPublicAddressCommand.MESSAGE_SUCCESS, Messages.format(editedPerson));
        assertCommandSuccess(editCommand, model, expectedMessage, expectedModel);

    }

    @Test
    public void execute_invalidIndex_throwsCommandException() {
        Index outOfBoundIndex = Index.fromOneBased(model.getFilteredPersonList().size() + 1);
        EditPublicAddressCommand editCommand = new EditPublicAddressCommand(outOfBoundIndex,
            Network.BTC, VALID_PUBLIC_ADDRESS_1, BTC_MAIN_ADDRESS.label);


        assertCommandFailure(editCommand, model, Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
    }

    @Test
    public void execute_nonExistentLabel_throwsCommandException() {
        model.addPerson(JOE);
        Index index = Index.fromOneBased(model.getFilteredPersonList().size());
        EditPublicAddressCommand editCommand = new EditPublicAddressCommand(index,
            Network.BTC, VALID_PUBLIC_ADDRESS_1,

            "nonExistentLabel");

        Person personToEdit = model.getFilteredPersonList().get(index.getZeroBased());
        String expectedMessage = String.format(EditPublicAddressCommand.MESSAGE_NON_MATCHING_LABEL,
            Network.BTC, personToEdit.getName());

        assertCommandFailure(editCommand, model, expectedMessage);
    }

    @Test
    public void equals() {
        EditPublicAddressCommand editFirstCommand = new EditPublicAddressCommand(Index.fromZeroBased(0),
            Network.BTC, VALID_PUBLIC_ADDRESS_1, "label");
        EditPublicAddressCommand editSecondCommand = new EditPublicAddressCommand(Index.fromZeroBased(1),
            Network.BTC, VALID_PUBLIC_ADDRESS_1, "label");
        EditPublicAddressCommand editThirdCommand = new EditPublicAddressCommand(Index.fromZeroBased(0),
            Network.BTC, VALID_PUBLIC_ADDRESS_1, "differentLabel");
        EditPublicAddressCommand editFourthCommand = new EditPublicAddressCommand(Index.fromZeroBased(0),
            Network.BTC, VALID_PUBLIC_ADDRESS_2, "label");

        // same object -> returns true
        assertEquals(editFirstCommand, editFirstCommand);

        // same values -> returns true
        EditPublicAddressCommand editFirstCommandCopy = new EditPublicAddressCommand(Index.fromZeroBased(0),
            Network.BTC, VALID_PUBLIC_ADDRESS_1, "label");
        assertEquals(editFirstCommand, editFirstCommandCopy);

        // different types -> returns false
        assertNotEquals(1, editFirstCommand);

        // null -> returns false
        assertNotEquals(null, editFirstCommand);

        // different person -> returns false
        assertNotEquals(editFirstCommand, editSecondCommand);

        // different label -> returns false
        assertNotEquals(editFirstCommand, editThirdCommand);

        // different address -> returns false
        assertNotEquals(editFirstCommand, editFourthCommand);
    }

    @Test
    public void toStringMethod() {
        EditPublicAddressCommand editCommand = new EditPublicAddressCommand(Index.fromZeroBased(0),
            Network.BTC, VALID_PUBLIC_ADDRESS_1, "label");
        String expected = new ToStringBuilder(editCommand)
            .add("index", Index.fromZeroBased(0))
            .add("publicAddress",
                PublicAddressFactory.createPublicAddress(Network.BTC, VALID_PUBLIC_ADDRESS_1, "label"))
            .toString();
        assertEquals(expected, editCommand.toString());
    }

}
