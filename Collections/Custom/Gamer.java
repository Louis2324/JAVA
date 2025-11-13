package Collections.Custom;

public class Gamer implements  Comparable<Gamer> {
    private String name;
    private int rank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Gamer(String nm , int rank) {
        this.name = nm ;
        this.rank  = rank;
    }

    @Override
    public int compareTo(Gamer other) {
      if(this.rank != other.rank) {
          return Integer.compare(other.getRank(), getRank() );
      }else {
          return this.name.compareTo(other.name);
      }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Gamer)) return false;
        Gamer other = (Gamer) obj;
        return this.name.equals(other.name) && this.rank == other.rank ;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(rank);
    }

    @Override
    public String toString() {
        return name + "(" + rank + ")" ;
    }

}
