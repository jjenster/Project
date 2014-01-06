import java.util.ArrayList;
import java.util.Collection;

public class Filter {

	private Message message;
	private ArrayList<String> listSenders;
	private ArrayList<String> listWords;

	public Filter(ArrayList<String> listSenders, ArrayList<String> listWords) {
		this.listSenders = listSenders;
		this.listWords = listWords;
	}

	public void spam(Message message) {

		String sender = message.getSender();

		for (String listSender : listSenders) {
			if (sender.equalsIgnoreCase(listSender)) {
				addWords(message);
				int min = message.getMin();
			}
		}

		String subject = message.getSubject();
		String body = message.getBody();

		subject.toLowerCase().trim();
		String[] subjectWords = subject.split(" ");
		body.toLowerCase().trim();
		String[] bodyWords = body.split(" ");
		ArrayList<String> subjectBody = new ArrayList<String>();
		for (int i = 0; i < subjectWords.length; i++) {
			subjectBody.add(subjectWords[i]);
		}
		for (int i = 0; i < bodyWords.length; i++) {
			subjectBody.add(bodyWords[i]);
		}

		for (int i = 0; i < listWords.size(); i++) {
			for (int j = 0; j < subjectBody.size(); j++) {
				if (listWords.get(i).equalsIgnoreCase(subjectBody.get(j))) {
					addSender(message);
					addWords(message);
					int min = message.getMin();
				}
			}
		}
	}

	public void addSender(Message message) {
		listSenders.add(message.getSender());
	}

	public void addWords(Message message) {
		String subject = message.getSubject();
		subject.replaceAll("[^A-z0-9//s]", "");
		String[] subjectWords = subject.split(" ");

		for (String subjectWord : subjectWords) {
			if (subjectWord.length() > 5) {
				for (String listWord : listWords) {
					if (!subjectWord.equalsIgnoreCase(listWord)) {
						listWords.add(subjectWord);
					}
				}
			}
		}
	}
}
