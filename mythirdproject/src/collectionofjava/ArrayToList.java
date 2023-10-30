package collectionofjava;

import java.util.*;

interface MyList {
	void convert(String[] a);

	void replace(int idx);
	ArrayList<String>compact();


	public class InvalidStringException extends Exception{

	    public InvalidStringException(String this_is_an_invalid_string){
	        super(this_is_an_invalid_string);
	    }
	    public class ArrayToList implements MyList{

	        List<String> arrayToList;


	        public ArrayToList(){
	            this.arrayToList = new ArrayList<>();
	        }

	        @Override
	        public void convert(String[] a){
	            this.arrayToList.clear();
	            for (int i = 0; i < a.length; i++){
	                this.arrayToList.add(a[i]);
	                System.out.printf("I have added the string: %s " +
	                        "at the index: %d.\n", a[i], i);
	            }
	        }

	        @Override
	        public void replace(int idx) {
	            System.out.printf("I have replaced the string: %s with a null string.", this.arrayToList.get(idx));
	            this.arrayToList.set(idx, "");
	        }

	        @Override
	        public ArrayList<String> compact() {
	            ArrayList<String> newlist = new ArrayList<>();

	            for (String e : this.arrayToList){
	                if (!e.equals(""))
	                    newlist.add(e);
	            }

	            return newlist;
	        }
	    }
//	    <ArrayToListMain.java> - tester

	    public class ArrayToListMain {
	        public static void main(String[] args) throws InvalidStringException {

	            Scanner sc = new Scanner(System.in);
	            Random rand = new Random(0);

	            int n = Integer.parseInt(sc.nextLine());
	            String[] a = new String[n];

	            for(int i = 0; i < n; i++)
	                a[i] = sc.nextLine();

	            MyList obj = new MyList();

	            obj.convert(a);
	            int x = rand.nextInt(n);
	            for(int i = 0; i < x; i++)
	                obj.replace(rand.nextInt(n));


	            ArrayList<String> s = obj.compact();



	            for (int i = 0; i < s.size(); i++){
	                if(s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122){
	                    try{
	                        throw new InvalidStringException("This is an invalid string");
	                    }
	                    catch(InvalidStringException e){System.out.println(e.getMessage());}
	                }
	            }
	        }
	    }}
}
	            


	        
	      
	