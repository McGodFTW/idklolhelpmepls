package xyz.mcgodftw;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import xyz.mcgodftw.Commands.*;

public class bot {
	final static String prefix = "$";
	public static void main(String args[])throws LoginException{
		final JDA jda = new JDABuilder("NjMyNjk4Nzc0MTQ1MzM1MzE2.Xefxzg.Q9KPNX9W_1va1Qf7rsM9SQyFfv4").build();
		jda.addEventListener(new eventCountdown());
		jda.addEventListener(new helpCommand());
		jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
		jda.getPresence().setActivity(Activity.listening("Soumyajit's Moans"));
		
		
	}
}

