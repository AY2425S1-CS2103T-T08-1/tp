---

layout: default.md
title: "User Guide"
pageNav: 3
---

# DLTbook User Guide

<box type="info" seamless>
DLTbook is a desktop application that helps you manage your contacts and their Distributed Ledger Technology (DLT) public addresses. It combines an easy-to-use interface with powerful command-line features, making it perfect for both beginners and advanced users.
</box>


<panel header="💡 **New Users Start Here**" type="primary" expanded>

### Before You Begin

If terms like 'command line', 'terminal', or 'Java' sound unfamiliar to you, don't worry! Visit our:

- 📘 [Beginner's Guide](#beginner-s-guide) for basic concepts
- 🔧 [Setup Guide](#setup-guide) for installation help
- ❓ [FAQ Section](#faq) for common questions
- 🛠️ [Troubleshooting Guide](#common-errors) for known issues

### Experienced Users

If you're already familiar with DLTbook, jump straight to [Quick Start](#quick-start) for a quick overview on basic
commands.
Go to the [Features](#features) section for a detailed guide on all available commands and capabilities.
</panel>

## Quick Start

### System Requirements

- **Java 17 or newer installed**

<box type="info" seamless>

Not sure if you have Java? Check out [Setup Guide](#setup-guide)

</box>

### Quick Installation

1. **Download**: Download the latest release of [DLTbook.jar](https://github.com/AY2425S1-CS2103T-T08-1/tp/releases)

2. **Install**: Create a folder and move DLTbook.jar there

3. **Start**: Open Terminal and run `java -jar DLTbook.jar`

4. **Try it Out**: If you are an experienced user, skip to [Try It Out!](#try-it-out) for a guide of the basic commands
   or go to [Features](#features) for a detailed list of all commands.

## Beginner's Guide

<panel header="👋 **Welcome to DLTbook Beginner's Guide**" type="primary" expanded>

_If you're new to DLTbook or the concept of Distributed Ledger Technology (DLT), this guide will walk you through the
basics. Here, we'll cover key concepts, important terminology, and guide you through the first steps in using DLTbook._
</panel>

<br>

1. **Understanding the Basics**

DLTbook is a powerful tool that helps you manage contacts and DLT public addresses.
If you're not familiar with these terms, don't worry—this section breaks down the essential concepts.
<box type="info" seamless>

**What is Distributed Ledger Technology (DLT)?**

DLT refers to a digital system for recording transactions of assets in multiple places at once.
Unlike traditional databases, DLTs do not have a central administrator, which means blockchain records are
decentralized.
</box>

<box type="tip" seamless>

**Why is DLTBook useful in managing contacts?**

DLTbook simplifies the task of managing contacts linked with DLT public addresses,
ensuring secure and efficient interaction with distributed networks.
</box>

2. **Key Terms You Should Know**

Before diving in, let's clarify some essential terms:

<box type="info" seamless>

- **Blockchain**: A decentralized digital ledger that records transactions across multiple computers.
  Acts like a currency, but it's digital and secure.

- **Network**: A network on the blockchain (e.g., Bitcoin, Ethereum, Solana).

- **Wallet**: A digital tool used to store, send, and receive cryptocurrencies.

- **Wallet Name**: A label that you tag to the wallet.

- **Public Address**: A unique identifier tagged to the wallet to interact with the blockchain (similar to an account
  number).

- **Command Line**: A text-based interface used to run commands on your computer.

- **Java**: The programming language required to run DLTbook.
  </box>

3. **Getting Started: Your First Steps**

Here’s how you can start using DLTbook:

1. Follow our [setup guide](#setup-guide) to install Java and DLTbook on your computer.

2. Open the application and [try](#try-it-out) out some basic commands to manage contacts and DLT public addresses.

3. If you encounter any issues, refer to our [troubleshooting guide](#known-issues) or [FAQ section](#faq) for help.

4. Once you're comfortable with the basics, explore the full range of [features](#features) available in DLTbook.

### Setup Guide

1. **Download/Check Java Installation**

    - Download Java from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

    - Open Terminal (Mac/Linux) or Command Prompt (Windows) by searching in your system and type `java -version`

    - If you see a version number, you're all set! If not, download and install Java

<box type="info" seamless>

- **Note**: Java 17 or newer is required to run DLTbook

- **Note**: If you have multiple versions of Java installed, you may need to specify the path to the correct version
  when running DLTbook

- **Note**: If you're using a Mac, you may need to install the Java Development Kit (JDK) instead of the Java Runtime
  Environment (JRE)
  </box>

2. **Download DLTbook**

    - Get the latest version from our [download page](https://github.com/AY2425S1-CS2103T-T08-1/tp/releases)

    - Download the file named `DLTbook.jar`

3. **Install the Application**

    - Open File Explorer (Windows) or Finder (Mac) and navigate to the Downloads folder

    - Create a new folder where you'd like to keep DLTbook

    - Move the downloaded `DLTbook.jar` file into this folder

4. **Start DLTbook**

    - Copy the path to the folder where you saved `DLTbook.jar`

    - Open Terminal (Mac/Linux) or Command Prompt (Windows)

    - Navigate to the folder where `DLTbook.jar` is saved by using the `cd` command like this:
   ```
    cd your/path/to/DLTbook
   ```
    - Run the Command: `java -jar DLTbook.jar`

<br>

After a few seconds, you'll see the DLTbook window:

![Ui](images/Ui.png)

### Try It Out!

DLTbook comes with sample data to help you get started. Here are some basic commands to try:

1. **View all contacts**

   ```
   list
   ```

2. **Add a new contact**

   ```
   add n/Travis p/91234567 e/travis@Linkifyai.com a/1 Travis Avenue, Singapore
   ```


3. **Add a DLT public address**

   ```
   addpa 1 c/BTC l/wallet1 pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2
   ```


4. **Retrieves the public address of a contact**

   ```
   retrievepa l/wallet1 c/BTC 
   ```


5. **Remove a contact**

   ```
   delete 3
    ```

6. **Exit the application**

    ```
    exit
    ```

<br>

### Need Help?

- Type `help` in the application to see all available commands

- Visit our [Detailed Features Guide](#features) below

- Check our [Troubleshooting Guide](link-to-troubleshooting) if you run into any issues

--------------------------------------------------------------------------------------------------------------------


Ready to learn more? Check out the [Features](#features) section below for a complete guide to all DLTbook commands and
capabilities.
<br>
<br>

## Features

### Command Overview

DLTbook supports the following commands:

 Command                                                                             | Description                                                                     
-------------------------------------------------------------------------------------|---------------------------------------------------------------------------------
 [**Help**](#viewing-help-help)                                                      | Shows a message explaining how to access the help page                          
 [**Add**](#adding-a-person-add)                                                     | Adds a person to the address book                                               
 [**List**](#listing-all-persons-list)                                               | Shows a list of all persons in the address book                                 
 [**Edit**](#editing-a-person-edit)                                                  | Edits an existing person in the address book                                    
 [**Find**](#locating-persons-by-name-find)                                          | Finds persons whose names contain any of the given keywords                     
 [**Delete**](#deleting-a-person-delete)                                             | Deletes the specified person from the address book                              
 [**Clear**](#clearing-all-entries-clear)                                            | Clears all entries from the address book                                        
 [**Exit**](#exiting-the-program-exit)                                               | Exits the program                                                               
 [**Add Public Address**](#adding-a-public-address-to-a-contact-addpa)               | Adds a public address to a person                                              
 [**Edit Public Address**](#editing-a-public-address-of-a-contact-editpa)            | Edits an existing public address of a person                                   
 [**Retrieve Public Address**](#retrieving-public-addresses-of-a-contact-retrievepa) | Retrieves the public addresses of a person                                     
 [**Delete Public Address**](#deleting-a-public-address-of-a-contact-deletepa)       | Deletes the public address of a person                                         
 [**Search Public Address**](#searching-for-a-public-address-publicaddresssearch)    | Searches for a public address                                                   
 [**Filter**](#filtering-persons-by-public-addresses-network-filter)                 | Filters out a list of persons with the public addresses of the specified network 

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

* Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`) will be
  ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

* If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines
  as space characters surrounding line-breaks may be omitted when copied over to the application.
  </box>
  <br>

--------------------------------------------------------------------------------------------------------------------

### Viewing help : `help`

Shows a message explaning how to access the help page.

![help message](images/helpMessage.png)

Format: `help`

<br>

--------------------------------------------------------------------------------------------------------------------

### Adding a person: `add`

Adds a person to the address book.

Format: `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG]…​`


<box type="tip" seamless>


**Tip:** A person can have any number of tags (including 0)

</box>


Examples:

* `add n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01`

* `add n/Betsy Crowe t/friend e/betsycrowe@example.com a/Newgate Prison p/1234567 t/criminal`

<br>

--------------------------------------------------------------------------------------------------------------------

### Listing all persons : `list`

Shows a list of all persons in the address book.

Format: `list`

<br>

--------------------------------------------------------------------------------------------------------------------

### Editing a person : `edit`

Edits an existing person in the address book.

Format: `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [t/TAG]…​`

* Edits the person at the specified `INDEX`. The index refers to the index number shown in the displayed person list.
  The index **must be a positive integer** 1, 2, 3, …​

* At least one of the optional fields must be provided.

* Existing values will be updated to the input values.

* When editing tags, the existing tags of the person will be removed i.e adding of tags is not cumulative.

* You can remove all the person’s tags by typing `t/` without

  specifying any tags after it.

Examples:

* `edit 1 p/91234567 e/johndoe@example.com` Edits the phone number and email address of the 1st person to be `91234567`
  and `johndoe@example.com` respectively.

* `edit 2 n/Betsy Crower t/` Edits the name of the 2nd person to be `Betsy Crower` and clears all existing tags.

<br>

--------------------------------------------------------------------------------------------------------------------

### Locating persons by name: `find`

Finds persons whose names contain any of the given keywords.

Format: `find KEYWORD [MORE_KEYWORDS]`

* The search is **case-insensitive**. e.g `hans` will match `Hans`

* The order of the keywords does not matter. e.g. `Hans Bo` will match `Bo Hans`

* Only the name is searched.

* Only full words will be matched. e.g. `Han` will not match `Hans`

* Persons matching at least one keyword will be returned (i.e. `OR` search).

  e.g. `Hans Bo` will return `Hans Gruber`, `Bo Yang`

Examples:

* `find John` returns `john` and `John Doe`

* `find alex david` returns `Alex Yeoh`, `David Li`<br>

  ![result for 'find alex david'](images/findAlexDavidResult.png)

<br>

--------------------------------------------------------------------------------------------------------------------

### Deleting a person : `delete`

Deletes the specified person from the address book.

Format: `delete INDEX`

* Deletes the person at the specified `INDEX`.

* The index refers to the index number shown in the displayed person list.

* The index **must be a positive integer** 1, 2, 3, …​

Examples:

* `list` followed by `delete 2` deletes the 2nd person in the address book.

* `find Betsy` followed by `delete 1` deletes the 1st person in the results of the `find` command.

<br>

--------------------------------------------------------------------------------------------------------------------

### Adding a public address to a person : `addpa`

Adds a public address to a person.

Format: `addpa INDEX c/NETWORK l/WALLET_NAME pa/PUBLIC_ADDRESS`

* Adds a public address to a person at the specified `INDEX`. The index refers to the index number shown in the
  displayed person list.
  The index **must be a positive integer** 1, 2, 3, …​

* The `NETWORK` parameter specifies the ticker name for each network (e.g., `BTC`, `ETH`,
  `SOL`, etc.). This field is **case-insensitive** and will be converted to UPPERCASE. <br />
  Allowed values: `BTC|ETH|SOL`.

* The `WALLET_NAME` parameter specifies the wallet name to which the public address belongs. 
  This field is **case-insensitive** and will be stored as is.

* The `PUBLIC_ADDRESS` parameter specifies the public address to be added.
  The length of BTC/ETH/SOL public addresses should be more than 26 characters, less than 44 characters and can only 
  contain alphanumeric characters.
  This field is **case-insensitive** and will be converted to lowercase.

Examples:

* `addpa 1 c/ETH l/wallet1 pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2` adds a public address
  to the first person on the list `Alex Yeoh` under the ETH network with the wallet name `wallet1` and the public
  address `0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2`.

* `addpa 4 c/BTC l/savings_wallet pa/0x71C7656EC7ab88b098defB751B7401B5f6d8976F` adds a public address to the fourth
  person on the list `David Li` under the BTC network with the wallet name `savings_wallet` and the public address
  `0x71C7656EC7ab88b098defB751B7401B5f6d8976F`.

![img.png](img.png)

<br>

--------------------------------------------------------------------------------------------------------------------

### Editing a public address of a person : `editpa`

Edits an existing public address of a person.

Format: `editpa INDEX c/NETWORK l/WALLET_NAME pa/PUBLIC_ADDRESS`

* Edits the public address of the person at the specified `INDEX`. The index refers to the index number shown in the
  displayed person list.
  The index **must be a positive integer** 1, 2, 3, …​

* The `NETWORK` parameter specifies the ticker name for each network (e.g., `BTC`, `ETH`,
  `SOL`, etc.). This field is **case-insensitive** and will be converted to UPPERCASE. <br />
  Allowed values: `BTC|ETH|SOL`.

* The `WALLET_NAME` parameter specifies the wallet name to which the public address belongs.
  This field is **case-insensitive** and will be stored as is. 

* The `PUBLIC_ADDRESS` parameter specifies the new public address to be added.
  The length of BTC/ETH/SOL public addresses should be more than 26 characters, less than 44 characters and can only
  contain alphanumeric characters.
  This field is **case-insensitive** and will be converted to lowercase.

#### Examples

* `editpa 3 c/BTC l/Daily wallet pa/14qViLJfdGaP4EeHnDyJbEGQysnCpwk3gd`<br />
  Changes the third person's BTC public address labelled `Daily wallet` to `14qViLJfdGaP4EeHnDyJbEGQysnCpwk3gd`.<br />

* `editpa 3 c/BTC l/daily wallet pa/14qViLJfdGaP4EeHnDyJbEGQysnCpwk3gd`<br />
  Changes the third person's BTC public address labelled "Daily wallet" as `WALLET_NAME` is **case-insensitive**.

<br>

--------------------------------------------------------------------------------------------------------------------

### Retrieving public addresses of a person : `retrievepa`

Retrieves the public addresses of a person.

Format: `retrievepa l/WALLET_NAME [c/NETWORK] [n/PERSON_NAME]`

* `WALLET_NAME` parameter is compulsory and specifies the label (or part of the label) of the public address(es) to be
  retrieved. This field is **case-insensitive**.

* `NETWORK` parameter is optional and specifies the ticker name for each network.
  This field is **case-insensitive** <br />
  Allowed values: `BTC|ETH|SOL`.

* `PERSON_NAME` parameter is optional and specifies the name (or part of the name) of the person(s) whose addresses
  should be retrieved. This field is **case-insensitive**.

#### Examples

* `retrievepa l/MyWallet`<br />
  Retrieves all public addresses with labels containing "MyWallet" for all persons and networks.

* `retrievepa l/Daily c/BTC`<br />
  Retrieves all BTC public addresses with labels containing "Daily" for all persons.

* `retrievepa l/Savings n/John`<br />
  Retrieves all public addresses with labels containing "Savings" for persons whose names contain "John".

* `retrievepa l/Business c/ETH n/Alice`<br />
  Retrieves all ETH public addresses with labels containing "Business" for persons whose names contain "Alice".

<br>

--------------------------------------------------------------------------------------------------------------------

### Deleting a public address of a person : `deletepa`

Deletes the public address of a person.

Format: `deletepa INDEX c/NETWORK [l/WALLET_NAME]`

* Deletes the public address of the person at the specified `INDEX`. The index refers to the index number shown in the
  displayed person list.
  The index **must be a positive integer** 1, 2, 3, …​

* The `NETWORK` parameter specifies the ticker name for each network (e.g., `BTC`, `ETH`,
  `SOL` etc.). This field is **case-insensitive** and will be converted to UPPERCASE. <br />
  Allowed values: `BTC|ETH|SOL`.

* The `WALLET_NAME` parameter is not compulsory and specifies the wallet name of the public address 
  that will be deleted. If `WALLET_NAME` is not provided, all public addresses in the `NETWORK` of the person 
  at the specified `INDEX` will be deleted. This field is **case-insensitive**.

Examples:

* `deletepa 1 c/BTC l/wallet1` deletes the public address of the first person in the BTC network with the wallet name
  `wallet1`.

* `deletepa 3 c/BTC` deletes all the public addresses of the third person in the BTC network.

<br>

--------------------------------------------------------------------------------------------------------------------

### Searching for a public address : `searchpa`

Searches for a public address.

Format: `searchpa pa/PUBLIC_ADDRESS`

* Searches for a public address based on the `PUBLIC_ADDRESS` provided.

* The `PUBLIC_ADDRESS` parameter specifies the public address to be added.
  The length of BTC/ETH/SOL public addresses should be more than 26 characters, less than 44 characters and can only
  contain alphanumeric characters.
  This field is **case-insensitive** and will be converted to lowercase.

Examples:

* `searchpa pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2` searches for a public
  address `0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2` and displays the person and wallet to
  which it belongs.

<br>

--------------------------------------------------------------------------------------------------------------------

### Filtering persons by public addresses network : `filter`

Filters out a list of persons with the public addresses of the specified network.

Format: `filter c/NETWORK`

* The `NETWORK` parameter specifies the ticker name for each network (e.g., `BTC`, `ETH`,
  `SOL` etc.). This field is **case-insensitive** and will be converted to UPPERCASE. <br />
  Allowed values: `BTC|ETH|SOL`.

Examples:

* `filter c/BTC` filters a list of persons with the public addresses of `BTC` and
  displays it with their respective list number.

<br>

--------------------------------------------------------------------------------------------------------------------

### Clearing all entries : `clear`

Clears all entries from the address book.

Format: `clear`

<br>

--------------------------------------------------------------------------------------------------------------------

### Exiting the program : `exit`

Exits the program.

Format: `exit`

<br>

--------------------------------------------------------------------------------------------------------------------

### Saving the data

DLTbook data are saved in the hard disk automatically after any command that changes the data. There is no need to save
manually.

<br>

### Editing the data file

DLTbook data are saved automatically as a JSON file `[JAR file location]/data/addressbook.json`. Advanced users are
welcome to update data directly by editing that data file.

**Caution:**

If your changes to the data file makes its format invalid, DLTbook will discard all data and start with an empty data
file at the next run. Hence, it is recommended to take a backup of the file before editing it.<br>

Furthermore, certain edits can cause the AddressBook to behave in unexpected ways (e.g., if a value entered is outside
the acceptable range). Therefore, edit the data file only if you are confident that you can update it correctly.
</box>

--------------------------------------------------------------------------------------------------------------------

## FAQ

**Q**: How do I transfer my data to another Computer?<br>

**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains
the data of your previous AddressBook home folder.

--------------------------------------------------------------------------------------------------------------------

## Common Errors

## Known issues

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only
   the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the
   application before running the application again.

2. **If you minimize the Help Window** and then run the `help` command (or use the `Help` menu, or the keyboard shortcut
   `F1`) again, the original Help Window will remain minimized, and no new Help Window will appear. The remedy is to
   manually restore the minimized Help Window.

--------------------------------------------------------------------------------------------------------------------

## Command summary

| Action                      | Format, Examples                                                                                                                                                       |
|-----------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Add**                     | `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG]...` <br> e.g., `add n/James Ho p/22224444 e/jamesho@example.com a/123, Clementi Rd, 1234665 t/friend t/colleague` |
| **Clear**                   | `clear`                                                                                                                                                                |
| **Delete**                  | `delete INDEX`<br> e.g., `delete 3`                                                                                                                                    |
| **Edit**                    | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`<br> e.g.,`edit 2 n/James Lee e/jameslee@example.com`                                           |
| **Find**                    | `find KEYWORD [MORE_KEYWORDS]`<br> e.g., `find James Jake`                                                                                                             |
| **List**                    | `list`                                                                                                                                                                 |
| **Help**                    | `help`                                                                                                                                                                 |
| **Exit**                    | `exit`                                                                                                                                                                 |
| **Add Public Address**      | `addpa INDEX c/NETWORK l/WALLET_NAME pa/PUBLIC_ADDRESS`<br> e.g., `addpa 1 c/ETH l/wallet1 pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2`      |
| **Edit Public Address**     | `editpa INDEX c/NETWORK l/WALLET_NAME pa/NEW_ADDRESS`<br> e.g., `editpa 3 c/BTC l/Daily wallet pa/14qViLJfdGaP4EeHnDyJbEGQysnCpwk3gd`                                  |
| **Retrieve Public Address** | `retrievepa l/WALLET_NAME [c/NETWORK] [n/PERSON_NAME]`<br> e.g., `retrievepa l/wallet1 c/BTC n/John`                                                                   |
| **Delete Public Address**   | `deletepa c/NETWORK [l/WALLET_NAME]`<br> e.g., `deletepa 1 c/BTC l/wallet1`                                                                                            |
| **Public Address Search**   | `searchpa pa/PUBLIC_ADDRESS`<br> e.g., `searchpa pa/0x28f91d6e72eaf4372892e6c6e45dc41b574163e9fcdf94f4997958b46d772fa2`                                                |
| **Filter**                  | `filter c/NETWORK`<br> e.g., `filter c/BTC`                                                                                                                            |
