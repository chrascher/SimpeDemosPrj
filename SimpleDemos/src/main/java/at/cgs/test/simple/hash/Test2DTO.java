package at.cgs.test.simple.hash;


public class Test2DTO  {

  private String id;
  private String paramTwo;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getParamTwo() {
    return paramTwo;
  }

  public void setParamTwo(String paramTwo) {
    this.paramTwo = paramTwo;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
    result = prime * result + ((this.paramTwo == null) ? 0 : this.paramTwo.hashCode());
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
    Test2DTO other = (Test2DTO) obj;
    if (this.id == null) {
      if (other.id != null)
        return false;
    } else if (!this.id.equals(other.id))
      return false;
    if (this.paramTwo == null) {
      if (other.paramTwo != null)
        return false;
    } else if (!this.paramTwo.equals(other.paramTwo))
      return false;

    return true;
  }

}

