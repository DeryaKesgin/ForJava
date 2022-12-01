package forvizeciftyonludgrsl;

public class CDdugumislem {
	
	CDdugum head=null;
	CDdugum tail=null;
	
	public void basaekle(int data) {
	
	CDdugum eleman=new CDdugum(data);
	
	if(head==null) {
		head=eleman;
		tail=eleman;
	}
	else {
		eleman.next=head;
		head.prev=eleman;
		head=eleman;
	}
	
     }
	public void sonaekle(int data) {
		
		CDdugum eleman=new CDdugum(data);
		
		if(head==null) {
			head=eleman;
			tail=eleman;
		}
		else {
			tail.next=eleman;
			eleman.prev=tail;
			tail=eleman;
		}
		
	     }
	
	
public void arayaaekle(int indis,int data) {
		
		CDdugum eleman=new CDdugum(data);
		
		if(head==null) {
			head=eleman;
			tail=eleman;
		}
		else if(head!=null && indis==0) {
			eleman.next=head;
			head.prev=eleman;
			head=eleman;
		}
		
		else {
			
			int d=0;
			CDdugum temp=head;
			CDdugum temp2=head;
			
			while(temp!=null) {
				temp2=temp;
				temp=temp.next;
				d++;
			}
			temp=head;
			
			if(indis>d) {
				tail.next=eleman;
				eleman.prev=tail;
				tail=eleman;
			}
			else {
				
				int i=0;
				while(i!=indis) {
					temp=temp.next;
					i++;
				}
				eleman.prev=temp.prev;
				temp.prev.next=eleman;
				eleman.next=temp;
				temp.prev=eleman;
				
			}
			
		}
		
	     }
	
	public void bastansil() {
		
		if(head==null) {
			System.out.println("liste bos");
		}
		else if(head.next==null) {
			
			head=null;
			tail=null;
			}
			else {
			
			head=head.next;
			head.prev=null;
			
		}
		
		
	}
public void sondansil() {
		
		if(head==null) {
			System.out.println("liste bos");
		}
		else if(head.next==null) {
			
			head=null;
			tail=null;
			}
			else {
			
			tail=tail.prev;
			tail.next=null;
			
		}
		
		
	}
	
public void aradansil(int indis) {
	if(head==null) {
		System.out.println("liste bos");
	}
	else if(head.next==null) {
		
		head=null;
		tail=null;
		}
	else if(head!=null&&indis==0) {
		head=head.next;
		head.prev=null;
		
	}
	
		else {
		int i=0;
		CDdugum temp=head;
		while(temp!=null) {
			i++;
			temp=temp.next;
			
		}
		temp=head;
		if(indis>=(i-1)) {
			tail=tail.prev;
			tail.next=null;
		}
		else {
			
			int n=0;
			while(n<indis) {
				n++;
				temp=temp.next;
				
			}
			temp.next.prev=temp.prev;
			temp.prev.next=temp.next;
			
			
		}
		
		
	}
	
	
}

	
	
	
	
	public void yazdir() {
		CDdugum temp=head;
		
		while(temp!=null) {
			
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println("************");
	}
	
	public void sondanyazdir() {
		CDdugum temp=tail;
		
		while(temp!=null) {
			
			System.out.println(temp.data);
			temp=temp.prev;
		}
		System.out.println("************");
	}
	
	
	
	
	
	
	
}
