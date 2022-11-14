package Methods;

public class SplitString {

	public static void main(String[] args) {

		String a = "Is it saturday! Is it raining? Do we have a Java Class today?";
		String[] sentence = a.split("\\?");
		System.out.println(sentence.length);

		for (String bySentence : sentence) {
			System.out.println(bySentence);
			System.out.println(bySentence.length());
		}
	}
}
