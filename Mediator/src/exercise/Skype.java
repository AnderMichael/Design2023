package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Skype implements ICanalComunicacion {
	private List<TeamMember> globalTeam = new ArrayList<>();
	private List<TeamMember> teamQA = new ArrayList<>();
	private List<TeamMember> teamSM = new ArrayList<>();
	private List<TeamMember> teamDEV = new ArrayList<>();

	private HashMap<String, List<TeamMember>> map = new HashMap<>();

	public Skype() {
		map.put("QA", teamQA);
		map.put("DEV", teamDEV);
		map.put("SM", globalTeam);
	}

	@Override
	public void sendMessage(String message, TeamMember member) {
		List<TeamMember> groupMembers = map.get(member.getCargo());
		for (TeamMember teamMember : groupMembers) {
			if (!teamMember.equals(member)) {
				teamMember.reciveMessage(message);
			}
		}

	}

	public void addQA(QA memberQA) {
		teamQA.add(memberQA);
		globalTeam.add(memberQA);
	}

	public void addSM(SM memberSM) {
		teamSM.add(memberSM);
		globalTeam.add(memberSM);
	}

	public void addDEV(DEV memberDEV) {
		teamDEV.add(memberDEV);
		globalTeam.add(memberDEV);
	}
}
