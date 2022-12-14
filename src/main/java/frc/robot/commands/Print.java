package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class Print extends CommandBase {
	@SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
	private final String str;

	/**
	 * Creates a new Print Command.
	 *
	 * @param subsystem The subsystem used by this command.
	 */
	public Print(String s) {
		str = s;
		System.out.println(s);
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize() {
		System.out.println(str);
	}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
		System.out.println(str);
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		System.out.println(str);
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		return false;
	}
}
