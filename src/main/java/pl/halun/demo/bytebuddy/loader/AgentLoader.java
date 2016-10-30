package pl.halun.demo.bytebuddy.loader;

import java.io.File;

import net.bytebuddy.agent.ByteBuddyAgent;

public class AgentLoader {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err
					.println("Please provide process id and path to agent jar");
			System.exit(-1);
		}
		
		ByteBuddyAgent.attach(new File(args[1]), args[0]);
	}
}
