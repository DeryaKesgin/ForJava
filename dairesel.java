package forvizeDairesel;

public class Ddugumislem {
	
	Ddugum head=null;
	Ddugum tail=null;
	
	public void basaekle(int data) {
		Ddugum eleman=new Ddugum(data);
		
		if(head==null) {
			head=eleman;
			tail=eleman;
			tail.next=head;
		}
		else {
			eleman.next=head;
			head=eleman;
			tail.next=head;
		}
		
	}
	
	public void sonaekle(int data) {
		Ddugum eleman=new Ddugum(data);
		
		if(head==null) {
			head=eleman;
			tail=eleman;
			tail.next=head;
		}
		else {
			tail.next=eleman;
			tail=eleman;
			tail.next=head;
		}
		
	}
	
	public void arayaekle(int indis,int data) {
		Ddugum eleman=new Ddugum(data);
		
		if(head==null) {
			head=eleman;
			tail=eleman;
			tail.next=head;
		}
		else if(head!=null&&indis==0){
			eleman.next=head;
			head=eleman;
			tail.next=head;
		}
		else {
			Ddugum temp=head;
			Ddugum temp2=head;
			int i=0;
			while(temp!=tail) {
				temp=temp.next;
				i++;
			}
			i++;
			if(indis>(i-1)) {
				tail.next=eleman;
				tail=eleman;
				tail.next=head;
			}
			
			else {
				temp=head;
				temp2=temp;
				int n=0;
				while(temp!=tail) {
						n++;
					temp2=temp;
					temp=temp.next;
			
				}
				temp2.next=eleman;
				eleman.next=temp;
				
			}
		}
		
	}
	
	public void bastansil() {
		if(head==null) {
			System.out.println("liste bos!!");
			
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}
		else {
			head=head.next;
			tail.next=head;
		}
	}
	
	public void sondansil() {
		if(head==null) {
			System.out.println("liste bos!!");
			
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}
		else {
			Ddugum temp=head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			tail=temp;
			tail.next=head;
		}
	}
	
	public void aradansil(int indis) {
		if(head==null) {
			System.out.println("liste bos!!");
			
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}
		else if(head!=null&&indis==0) {
			head=head.next;
			tail.next=head;
		}
		
		else {
			Ddugum temp=head;
			Ddugum temp2=head;
			int i=0;
			while(temp!=tail) {
				temp=temp.next;
				i++;
			}
			
			if(indis>=(i-1)) {
				temp=head;
		    while(temp.next!=tail) {
				temp=temp.next;
			}
			tail=temp;
			tail.next=head;
		}
			else {
				temp=head;
				temp2=temp;
				int n=0;
				while(n!=indis) {
					n++;
					temp2=temp;
					temp=temp.next;
				}
				temp2.next=temp.next;
				
				
			}
			
	}
	}
	
	
	public void yazdir() {
		
		if(head==null) {
			System.out.println("liste bos!!");
		}
		else {
			Ddugum temp=head;
			
			while(temp!=tail) {
				System.out.println(temp.data);
				temp=temp.next;
		
			}
			System.out.println(temp.data);
			System.out.println("*-*-*-*-*-*-*-*");
		}
	}
	

	
	
}
