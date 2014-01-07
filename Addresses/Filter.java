import java.util.ArrayList;

public class Filter {

	private ArrayList<Cutie> cuties;

	public Filter(ArrayList<Cutie> cuties) {
		this.cuties = cuties;
	}

	public ArrayList<Cutie> nameSearch(String name) {
		ArrayList<Cutie> cutiesNames = new ArrayList<Cutie>();

		for (Cutie cutie : cuties) {
			String cutieName = cutie.getName().toLowerCase();
			if (cutieName.contains(name.toLowerCase())) {
				cutiesNames.add(cutie);
			}
		}
		return cutiesNames;
	}

	public ArrayList<Cutie> uniSearch(String uni) {
		ArrayList<Cutie> cutiesUni = new ArrayList<Cutie>();

		for (Cutie cutie : cuties) {
			String cutieUni = cutie.getUni();
			
			if (cutieUni.contains(uni.toLowerCase())) {
				cutiesUni.add(cutie);
			}
		}
		return cutiesUni;
	}

}
