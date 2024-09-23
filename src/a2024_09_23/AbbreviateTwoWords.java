package a2024_09_23;

public class AbbreviateTwoWords {
	public static String abbrevName(String name) {
		String sampleName = "";
		String[] names = name.split(" ");
		for (String item : names) {
			sampleName += Character.toString(item.charAt(0)).toUpperCase() + ".";
		}

		return sampleName.substring(0, sampleName.length() - 1);

//		best solution//
//		return Arrays.stream(name.split(" ")).map(String::toUpperCase).map(word -> word.substring(0, 1))
//				.collect(Collectors.joining("."));
	}
}
