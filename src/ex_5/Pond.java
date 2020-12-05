package ex_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Pond {
	public Pond(String fileNm) {
		ArrayList<Integer[]> pond = chkPond(readPond(fileNm));
		System.out.println("result : " + getDepth(pond));
	}
	
	public ArrayList<Integer[]> readPond(String fileNm) {
		fileNm = "./src/ex_5/" + fileNm;
		try {
			ArrayList<Integer[]> result = new ArrayList<Integer[]>();
			FileReader fr = new FileReader(fileNm);
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				line = line.replaceAll(" ", "");
				int length = line.length();
				Integer[] a = new Integer[length];
				for(int i = 0; i < length; i++) {
					a[i] = Integer.parseInt(line.substring(i, i+1));
				}
				result.add(a);
			}
			return result;
		} catch (Exception e) {
			return null;
		}
	}
	
	public ArrayList<Integer[]> chkPond(ArrayList<Integer[]> pond) {
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
		int maxY = pond.size();
		int maxX = 0;
		boolean chk = false;
		
		for(int pondY = 0; pondY < maxY; pondY++) {
			maxX = pond.get(pondY).length;
			Integer[] child = new Integer[maxX];
			for(int pondX = 0; pondX < maxX; pondX++) {
				int point = pond.get(pondY)[pondX];
				if(pondY == 0 || (pondY + 1) == maxY || pondX == 0 || (pondX + 1) == maxX) {
					child[pondX] = point;
					continue;
				}
				
				int up = pond.get(pondY - 1)[pondX] == 0 ? -1 : pond.get(pondY - 1)[pondX];
				int down = pond.get(pondY + 1)[pondX] == 0 ? -1 : pond.get(pondY + 1)[pondX];
				int left = pond.get(pondY)[pondX - 1] == 0 ? -1 : pond.get(pondY)[pondX - 1];
				int right = pond.get(pondY)[pondX + 1] == 0 ? -1 : pond.get(pondY)[pondX + 1];
				
				if(point <= up && point <= down && point <= left && point <= right) {
					child[pondX] = point + 1;
					chk = true;
				} else {
					child[pondX] = point;
				}
			}
			result.add(child);
		}
		
		if(chk) {
			return chkPond(result);
		} else {
			return result;	
		}
	}
	
	public int getDepth(ArrayList<Integer[]> pond) {
		int result = 0;
		for(Integer[] child : pond) {
			for(Integer c : child) {
				System.out.print(c + " ");
				result += c;
			}
			System.out.print("\n");
		}
		
		return result;
	}
}
