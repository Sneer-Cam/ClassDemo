package com.code.test;

import java.io.Serializable;

public class Clothing implements Serializable
{
		private String clothing ;
		private String color ;
		public Clothing(String clothing, String color) {
			super();
			this.clothing = clothing;
			this.color = color;
		}
		public String getClothing() {
			return clothing;
		}
		public void setClothing(String clothing) {
			this.clothing = clothing;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((clothing == null) ? 0 : clothing.hashCode());
			result = prime * result + ((color == null) ? 0 : color.hashCode());
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
			Clothing other = (Clothing) obj;
			if (clothing == null) {
				if (other.clothing != null)
					return false;
			} else if (!clothing.equals(other.clothing))
				return false;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			return true;
		}
		
		
}
