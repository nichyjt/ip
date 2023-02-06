/*
 * Defines the structure of commands from user input
 * Generally, a user command consists of three components.
 * 1. Main Command
 * 2. Sub Command
 * 3. Payload
 * User input can be abstracted into:
 * <MainCommand> (<Payload>) (--<Subcommand> (<Subcommand payload>) --(<Subcommand2> (...)) ... )
 */

public enum Command {
    TASK_TODO(1, "todo", new String[]{}),
    TASK_DEADLINE(2, "deadline", new String[]{"by"}),
    TASK_EVENT(3, "event", new String[]{"from", "to"}),
    MARK(1, "mark", new String[]{}),
    UNMARK(1, "unmark", new String[]{}),
    EXIT(1, "exit", new String[]{}),
    LIST(1, "list", new String[]{}),
    UNKNOWN_COMMAND(1, "", new String[]{});

    // Defines how many arguments (subcommands + main command) a Command has
    // The argument length for a command must be minimally 1 (itself) e.g. list, mark
    private int argumentLength;
    private String mainCommand;
    private String[] subcommandNames;

    Command(int argumentLength, String commandName, String[] subcommandNames) {
        this.argumentLength = argumentLength;
        this.mainCommand = commandName;
        this.subcommandNames = subcommandNames;
    }

    public int getArgumentLength() {
        return argumentLength;
    }

    public String getMainCommand() {
        return mainCommand;
    }

    public String[] getSubcommandNames() {
        return subcommandNames;
    }
}
