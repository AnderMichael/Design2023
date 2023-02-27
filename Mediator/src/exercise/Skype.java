package exercise;

import java.util.ArrayList;
import java.util.List;

public class Skype implements ICanalComunicacion {
	private List<TeamMember> globalTeam = new ArrayList<>();
	private List<QA> teamQA = new ArrayList<>();
	private List<SM> teamSM = new ArrayList<>();
	private List<DEV> teamDEV = new ArrayList<>();

	@Override
	public void sendMessage(String message, TeamMember member) {
		switch (member.getCargo()) {
		case "QA": {
			for (QA qa : teamQA) {
				if (!qa.equals(member)) {
					qa.reciveMessage(message);
				}
			}
			break;
		}
		case "SM": {
			for (TeamMember teamMember : globalTeam) {
				if (!teamMember.equals(member)) {
					teamMember.reciveMessage(message);
				}
			}
		}
		case "DEV": {
			for (DEV dev : teamDEV) {
				if (!dev.equals(member)) {
					dev.reciveMessage(message);
				}
			}
			break;
		}
		default:
			break;
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
