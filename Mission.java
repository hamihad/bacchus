package bacchus;

class Mission{
		private int numero;
		private GregorianCalendar date;
		private List<Evenement> evenement = new ArrayList<Evenement>();
		private Livreur livreur;
		
		public void Mission(int numero,GregorianCalendar date,Livreur livreur){
			
				this.numero=numero;
				this.date=date;
				this.Livreur=livreur;
		}
}
