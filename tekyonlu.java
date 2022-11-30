package forvize2;

public class dgmislm {
	
	dgm head=null;
	dgm tail=null;
	
	public void sonaekle(int x) {
		dgm eleman=new dgm();
		
		eleman.data=x;
		eleman.next=null;
		
		if(head==null) {
			head=eleman;
			tail=eleman;
		}
		else {
			tail.next=eleman;
			tail=eleman;
		}
		
	}
	
	
	
	public void basaekle(int x) {
		dgm eleman=new dgm();
		
		eleman.data=x;
		eleman.next=null;
		
		if(head==null) {
			head=eleman;
			tail=eleman;
		}
		else {
			
			eleman.next=head;
			head=eleman;
			
		}
		
	}
	
	public void arayaekle(int indis,int x) {
		dgm eleman=new dgm();
		
		eleman.data=x;
		
		
		if(head==null&&indis==0) {
			eleman.next=null;
			head=eleman;
			tail=eleman;
		}
		else if(head!=null&&indis==0) {
			
			eleman.next=head;
			head=eleman;
			
		}
		
		else {
			
			int n=0;
			
			dgm temp=head;
			dgm temp2=head;
			
			while(temp!=null) {
				n++;
				temp2=temp;
				temp=temp.next;
			}
			
			if(indis==n) {
				eleman=tail.next;
				eleman=tail;
			}
			else {
				temp=head;
				temp2=head;
				
				int i=0;
				while(i<indis) {
					temp2=temp;
					temp=temp.next;
					i++;
				}
				temp2.next=eleman;
				eleman.next=temp;
			}
			
			
		}
		
	}
	
	
	public void bastansil() {
		if(head==null) {
			System.out.println("Liste Bos!!");
		}
		else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("Son eleman da silindi.");	
		}
		else {
			head=head.next;
		}
	}
	
	
	public void sondansil() {
		if(head==null) {
			System.out.println("Liste Bos!!");
		}
		else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("Son eleman da silindi.");	
		}
		else {
			dgm temp=head;
			dgm temp2=head;
			
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
				
			}
			temp2.next=null;
			tail=temp2;
			
		}
	}
	
	
	public void aradansil(int indis) {
		if(head==null) {
			System.out.println("Liste Bos!!");
		}
		else if(head.next==null&&indis==0) {
			head=null;
			tail=null;
			System.out.println("Son eleman da silindi.");	
		}
		else {
			dgm temp=head;
			dgm temp2=head;
			int n=0;
			while(temp.next!=null) {
				n++;
				temp2=temp;
				temp=temp.next;
			}
			if(indis==n) {
			temp2.next=null;
			tail=temp2;
			}
			else {
				temp=head;
				temp2=head;
				int i=0;
				while(i!=indis) {
					temp2=temp;
					temp=temp.next;
					i++;
				}
				temp2.next=temp.next;
				
			}
		}
	}
	
	
	
	
	
	
	
	public void yazdir() {
		dgm eleman=head;
		if(head==null) {
			System.out.println("liste bos!!");
		}
		else {
			while(eleman!=null) {
				System.out.println(eleman.data);
				eleman=eleman.next;
			}
			System.out.println("************");
		}
	}

	
	
}
