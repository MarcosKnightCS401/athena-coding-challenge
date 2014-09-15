import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordRanking {
	static long getRank(String input, long count) {
		if (input.length() == 1) return 1;

		else {
			int n = input.length();
			String remainder = input.substring(1);
			if (n > 2) {
				return count * factorial(n-1)/getDuplicateCount(input) + getRank(remainder, getCount(remainder));
			}
			else {
				return count * (n-1) + getRank(remainder, getCount(remainder));
			}
		}
	}

	static long getCount(String input) {
		long count = 0;
		char firstChar = input.charAt(0);
		char[] charArray = input.toCharArray();
		for (char c: charArray) {
			if(c < firstChar) {
				count++;
			}
		}
		return count;
	}

	static long getDuplicateCount(String input) {
		long totalCount = 1;
        char inputArray[] = input.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for(char c: inputArray) {
            hm.put(c, (hm.get(c) == null? 1 : hm.get(c) + 1));
        }

		Set<?> set = hm.entrySet();
		Iterator<?> i = set.iterator();

		while(i.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<Character, Integer> me = (Map.Entry<Character, Integer>)i.next();
			totalCount *= factorial(me.getValue());
		}

		return totalCount;
	}

	static long factorial(long f) {
		return ((f == 0) ? 1 : f * factorial(f - 1));
	}

	public static void main(String args[]) throws FileNotFoundException {
		int n;
		Scanner s = new Scanner(new File("C:\\Users\\Knight\\Documents"));

        while (s.hasNext()) {
            n=Integer.parseInt(s.nextLine().trim());
            char[][]maze=new char[n][n];
            int xStart =0;
            int yStart =0;

            for(int y=0;y<n;++y){
                String text = s.nextLine().trim();
                for(int x=0;x<n;++x){

                    maze[x][y]=text.charAt(x);
                    if(maze[x][y]=='B'){
                        xStart=x;
                        yStart=y;
                    }
                }
            }
        }
	}
}