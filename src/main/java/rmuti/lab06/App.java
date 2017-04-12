package rmuti.lab06;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args){			
		Car car1 = new Car("1","toyota",2000000);
		Car car2 = new Car("2","Honda",3000000);
		Car car3 = new Car("3","Ford",4000000);
		

		ArrayListPQ pq = new ArrayListPQ();
		pq.enqueue(car3);
		pq.enqueue(car1);
		pq.enqueue(car2);
		System.out.println(pq.toString());
		
		Car carPq = (Car)pq.peek();
		System.out.println(carPq);
		
		System.out.println(pq.dequeue());
		
		System.out.println(pq.toString());
		System.out.println(pq.peek());
	}
}