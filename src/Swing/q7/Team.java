package Swing.q7;


class Team{
		private String name;
		protected int points;
        protected int played;
		protected int wins;
        
		public Team(String n) {
			name= n;
		}
		public String readTeam() {

			return name;
		}
		public int readPlayed() {
			
			return played;
		}
		public int readPoints() {
			
			return points;
		}

		public void draw() {
			played+=1;
			points+=1;
		}
		public void loss() {
			played+=1;
		}

		public void win() {
			wins+=1;
			played+=1;
			points+=3;
		}
	}

