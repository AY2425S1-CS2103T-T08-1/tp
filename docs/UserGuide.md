---
layout: default.md
title: "User Guide"
pageNav: 3
---

# DLTbook User Guide

DLTbook is a **desktop app for managing contacts and DLT public addresses, optimized for use via a  Line Interface** (CLI) while still having the benefits of a Graphical User Interface (GUI). If you can type fast, DLTbook can get your contact management tasks done faster than traditional GUI apps.

<!-- * Table of Contents -->
<page-nav-print />

--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java `17` or above installed in your Computer.

1. Download the latest `.jar` file from [here](https://github.com/AY2425S1-CS2103T-T08-1/tp/releases).

1. Copy the file to the folder you want to use as the _home folder_ for your AddressBook.

1. Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar DLTbook.jar` command to run the application.<br>
   A GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)

1. Type the command in the command box and press Enter to execute it. e.g. typing **`help`** and pressing Enter will open the help window.<br>
   Some example commands you can try:

   * `list` : Lists all contacts.

   * `add n/travis p/91234567 e/travis@Linkifyai.com a/1 Travis Avenue, Singapore, Sinapore` : Adds a contact named `Travis` to the Address Book.

   * `delete 3` : Deletes the 3rd contact shown in the current list.

   * `clear` : Deletes all contacts.

   * `exit` : Exits the app.
   
   * `addPublicAddress c/ETH n/Travis w/wallet1 pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2` : Adds a public address to a contact

   * `retrievePublicAddress c/BTC n/Travis w/wallet1` : Retrieves the public address of a contact

   * `deletePublicAddress c/BTC n/Travis w/wallet1` : Deletes the public address of a contact

   * `publicAddresSearch pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2` : Searches for a public address

1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## Features

<box type="info" seamless>

**Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g `n/NAME [t/TAG]` can be used as `n/John Doe t/friend` or as `n/John Doe`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/friend`, `t/friend t/family` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`) will be ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

* If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines as space characters surrounding line-breaks may be omitted when copied over to the application.
</box>

### Viewing help : `help`

Shows a message explaning how to access the help page.

![help message](images/helpMessage.png)

Format: `help`


### Adding a person: `add`

Adds a person to the address book.

Format: `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG]…​`

<box type="tip" seamless>

**Tip:** A person can have any number of tags (including 0)
</box>

Examples:
* `add n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01`
* `add n/Betsy Crowe t/friend e/betsycrowe@example.com a/Newgate Prison p/1234567 t/criminal`

### Listing all persons : `list`

Shows a list of all persons in the address book.

Format: `list`

### Editing a person : `edit`

Edits an existing person in the address book.

Format: `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [t/TAG]…​`

* Edits the person at the specified `INDEX`. The index refers to the index number shown in the displayed person list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.
* When editing tags, the existing tags of the person will be removed i.e adding of tags is not cumulative.
* You can remove all the person’s tags by typing `t/` without
    specifying any tags after it.

Examples:
*  `edit 1 p/91234567 e/johndoe@example.com` Edits the phone number and email address of the 1st person to be `91234567` and `johndoe@example.com` respectively.
*  `edit 2 n/Betsy Crower t/` Edits the name of the 2nd person to be `Betsy Crower` and clears all existing tags.

### Locating persons by name: `find`

Finds persons whose names contain any of the given keywords.

Format: `find KEYWORD [MORE_KEYWORDS]`

* The search is case-insensitive. e.g `hans` will match `Hans`
* The order of the keywords does not matter. e.g. `Hans Bo` will match `Bo Hans`
* Only the name is searched.
* Only full words will be matched e.g. `Han` will not match `Hans`
* Persons matching at least one keyword will be returned (i.e. `OR` search).
  e.g. `Hans Bo` will return `Hans Gruber`, `Bo Yang`

Examples:
* `find John` returns `john` and `John Doe`
* `find alex david` returns `Alex Yeoh`, `David Li`<br>
  ![result for 'find alex david'](images/findAlexDavidResult.png)

### Deleting a person : `delete`

Deletes the specified person from the address book.

Format: `delete INDEX`

* Deletes the person at the specified `INDEX`.
* The index refers to the index number shown in the displayed person list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `delete 2` deletes the 2nd person in the address book.
* `find Betsy` followed by `delete 1` deletes the 1st person in the results of the `find` command.

### Clearing all entries : `clear`

Clears all entries from the address book.

Format: `clear`

### Exiting the program : `exit`

Exits the program.

Format: `exit`


### Adding a public address to a contact : `addPublicAddress`

Adds a public address to a contact.

Format: `addPublicAddress c/NETWORK n/NAME w/WALLET_NAME pa/PUBLIC_ADDRESS`

* Adds a public address to a contact based on the NAME
* The contact is identified by the `NAME` and `WALLET_NAME` provided.
* The `NETWORK` parameter specifies the ticker name for each network and should be in all CAPS (e.g., `BTC`, `ETH`, `SOL`, `SUI`, etc.).
* the `NAME` parameter specifies the name of the contact to which the public address belongs.
* The `PUBLIC_ADDRESS` parameter specifies the public address to be added, this fields is not cap sensitive.
* The `WALLET_NAME` parameter specifies the wallet name to which the public address belongs.

Examples:
* `addPublicAddress c/ETH n/Travis w/wallet1 pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2` adds a public address to a contact named `Travis` with the wallet name `wallet1` and the public address `0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2`.

### Retrieving a public address of a contact : `retrievePublicAddress`

Retrieves the public address of a contact.

Format: `retrievePublicAddress c/NETWORK n/NAME w/WALLET_NAME`

* Retrieves the public address of a contact based on the NAME
* The contact is identified by the `NAME` and `WALLET_NAME` provided.
* The `NETWORK` parameter specifies the ticker name for each network and should be in all CAPS (e.g., `BTC`, `ETH`, `SOL`, `SUI`, etc.).
* the `NAME` parameter specifies the name of the contact to which the public address belongs.

Examples:
* `retrievePublicAddress c/BTC n/Travis w/wallet1` retrieves the public address of a contact named `Travis` with the wallet name `wallet1`.

### Deleting a public address of a contact : `deletePublicAddress`

Deletes the public address of a contact.

Format: `deletePublicAddress c/NETWORK n/NAME w/WALLET_NAME`

* Deletes the public address of a contact based on the NAME
* The contact is identified by the `NAME` and `WALLET_NAME` provided.
* The `NETWORK` parameter specifies the ticker name for each network and should be in all CAPS (e.g., `BTC`, `ETH`, `SOL`, `SUI`, etc.).

Examples:
* `deletePublicAddress c/BTC n/Travis w/wallet1` deletes the public address of a contact named `Travis` with the wallet name `wallet1`.

### Searching for a public address : `publicAddressSearch`

Searches for a public address.

Format: `publicAddressSearch pa/PUBLIC_ADDRESS`

* Searches for a public address based on the `PUBLIC_ADDRESS` provided.
* The `PUBLIC_ADDRESS` parameter specifies the public address to be searched.
* This fields is not cap sensitive.


Examples:
* `publicAddressSearch pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2` searches for a public address `0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2` and displays the contact and wallet to which it belongs.

--------------------------------------------------------------------------------------------------------------------

### Saving the data

DLTbook data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

### Editing the data file

DLTbook data are saved automatically as a JSON file `[JAR file location]/data/addressbook.json`. Advanced users are welcome to update data directly by editing that data file.

<box type="warning" seamless>

**Caution:**
If your changes to the data file makes its format invalid, DLTbook will discard all data and start with an empty data file at the next run.  Hence, it is recommended to take a backup of the file before editing it.<br>
Furthermore, certain edits can cause the AddressBook to behave in unexpected ways (e.g., if a value entered is outside the acceptable range). Therefore, edit the data file only if you are confident that you can update it correctly.
</box>





--------------------------------------------------------------------------------------------------------------------

## FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous AddressBook home folder.

--------------------------------------------------------------------------------------------------------------------

## Known issues

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running the application again.
2. **If you minimize the Help Window** and then run the `help` command (or use the `Help` menu, or the keyboard shortcut `F1`) again, the original Help Window will remain minimized, and no new Help Window will appear. The remedy is to manually restore the minimized Help Window.

--------------------------------------------------------------------------------------------------------------------

## Command summary

Action     | Format, Examples
-----------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------
**Add**    | `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG]…​` <br> e.g., `add n/James Ho p/22224444 e/jamesho@example.com a/123, Clementi Rd, 1234665 t/friend t/colleague`
**Clear**  | `clear`
**Delete** | `delete INDEX`<br> e.g., `delete 3`
**Edit**   | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]…​`<br> e.g.,`edit 2 n/James Lee e/jameslee@example.com`
**Find**   | `find KEYWORD [MORE_KEYWORDS]`<br> e.g., `find James Jake`
**List**   | `list`
**Help**   | `help`
**Exit**   | `exit`
**Add Public Address** | `addPublicAddress c/NETWORK n/NAME w/WALLET_NAME pa/PUBLIC_ADDRESS`<br> e.g., `addPublicAddress c/ETH n/Travis w/wallet1 pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2`
**Retrieve Public Address** | `retrievePublicAddress c/NETWORK n/NAME w/WALLET_NAME`<br> e.g., `retrievePublicAddress c/BTC n/Travis w/wallet1`
**Delete Public Address** | `deletePublicAddress c/NETWORK n/NAME w/WALLET_NAME`<br> e.g., `deletePublicAddress c/BTC n/Travis w/wallet1`
**Public Address Search** | `searchPublicAddress pa/PUBLIC_ADDRESS`<br> e.g., `publicAddressSearch pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2`

