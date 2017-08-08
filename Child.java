package DailyChallenge;

public class Child extends Father{
	
		private final int ownEarnings;
		public Child(int networth,int children,int ownearnings)
		{
			super(networth , children);
			this.ownEarnings=ownearnings;
		}
		@Override
		public int getNetworth() {
			//this.getNetworth();
			return super.getNetworth()/super.getChildren()+ownEarnings;
		}
	
}
