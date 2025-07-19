//assesment 13

package Assesments13;

public class Movies<T,C> {
    T name;
    T actor;
    C releaseDate;

    public Movies(T name,T actor,C releaseDate){
        this.name=name;
        this.actor=actor;
        this.releaseDate=releaseDate;

        System.out.println("Movie name:"+name+" Actor:"+actor+" Release Date:"+releaseDate);
    }
}
