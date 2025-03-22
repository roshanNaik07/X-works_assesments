class Holi {
	
	String day;
	String area;
	String event;
	int entryFee;
	double time;
	int participents;
	
	public Holi(){
		super();
	}
	
	public Holi(String day){
		this();
		this.day=day;
	}
	
	public Holi(String day,String area){
		this(day);
		this.area=area;
	}
	
	public Holi(String day,String area,String event){
		this(day,area);
		this.event=event;
	}
	
	public Holi(String day,String area,String event,int entryFee){
		this(day,area,event);
		this.entryFee=entryFee;
	}
	
	public Holi(String day,String area,String event,int entryFee,double time){
		this(day,area,event,entryFee);
		this.time=time;
	}
	
	public Holi(String day,String area,String event,int entryFee,double time,int participents){
		this(day,area,event,entryFee,time);
		this.participents=participents;	
	}
	
	public void display(){
		System.out.println("day :"+day);
		System.out.println("area :"+area);
		System.out.println("event  :"+event);
		System.out.println("entryFee :"+entryFee);
		System.out.println("time :"+time);
		System.out.println("participents :"+participents);
	}
}