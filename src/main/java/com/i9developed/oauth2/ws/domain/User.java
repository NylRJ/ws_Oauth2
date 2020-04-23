package com.i9developed.oauth2.ws.domain;

import java.io.Serializable;

public class User implements Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String id;
		private String firtName;
		private String lastName;
		private String email;
		
		public User() {}

		public User(String firtName, String lastName, String email) {
			super();
			this.firtName = firtName;
			this.lastName = lastName;
			this.email = email;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFirtName() {
			return firtName;
		}

		public void setFirtName(String firtName) {
			this.firtName = firtName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
		
		
		
		
		
}
