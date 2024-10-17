package seedu.address.logic.parser;
import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PUBLIC_ADDRESS;
import seedu.address.logic.commands.SearchPublicAddressCommand;
import seedu.address.logic.parser.exceptions.ParseException;
/**
 * Parses input arguments and creates a new {@code SearchPublicAddressCommand} object
 */
public class SearchPublicAddressCommandParser implements Parser<SearchPublicAddressCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the {@code SearchPublicAddressCommand}
     * and returns a {@code SearchPublicAddressCommand} object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public SearchPublicAddressCommand parse(String args) throws ParseException {
        requireNonNull(args);
        ArgumentMultimap argMultimap = ArgumentTokenizer.tokenize(args, PREFIX_PUBLIC_ADDRESS);

        String remark = argMultimap.getValue(PREFIX_PUBLIC_ADDRESS).orElse("");
        return new SearchPublicAddressCommand( remark);
    }
}