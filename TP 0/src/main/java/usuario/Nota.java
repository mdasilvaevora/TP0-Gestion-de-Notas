package usuario;

import org.uqbar.commons.utils.Observable;

@Observable
public class Nota {

		private int id;
		private int value;
		private String created_at;
		private String updated_at;
		
		public void setId(int id){
			this.id=id;
		}
		
		public void setValue(int value){
			this.value=value;
		}
		
		public void setCreated_At(String created_at){
			this.created_at=created_at;
		}
		
		public int getId() {
			return id;
		}

		public int getValue() {
			return value;
		}

		public String getCreated_at() {
			return created_at;
		}

		public String getUpdated_at() {
			return updated_at;
		}

		public void setUpdated_At(String updated_at){
			this.updated_at=updated_at;
		}
		
}
