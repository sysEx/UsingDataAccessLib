package net.systemexklusiv.arc;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import de.spinfo.arc.persistance.service.update.WordUpdater;

@Nonnull
public class App {

	
	
	public App() {
//		this.message = checkNotNull(message,
//				"Expected not null message argument.");
		WordUpdater wordUpdater = new WordUpdater();
		Set<String> s = new HashSet<>();
		s.add("");
		wordUpdater.pushPosTaggerOptionsAsStrings(0, s);
//		
	}
}
