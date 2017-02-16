import java.util.ArrayDeque;
import java.util.Arrays;


public class SolarChallenge {

	public static int[] answer(int area){
		int[] finalList = {};
		ArrayDeque<Integer> areaQueue = new ArrayDeque<>();
		
		solarPanelCalc(area, areaQueue);
		
		finalList = new int[areaQueue.size()];
		for(int i=areaQueue.size()-1; i>=0; i--){
			finalList[i] = areaQueue.pop();
		}
		
		return finalList;
	}
	
	public static int solarPanelCalc(int area, ArrayDeque<Integer> aq){
		int panelArea = 0;
		
		if(area >= 1 && area <= 1000000){
			int temp = (int) Math.sqrt(area);
			if(temp <= 0){
				return panelArea;
			}else{
				panelArea = (int) Math.pow(temp, 2);
				int nextArea = area - panelArea;
				solarPanelCalc(nextArea, aq);
				aq.add(panelArea);
			}
		}
		return panelArea;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ans1 = answer(12);
		
		System.out.println(Arrays.toString(ans1));

	}

}
