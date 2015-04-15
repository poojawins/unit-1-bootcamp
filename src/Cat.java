/**
 * Created by alexandraqin on 4/14/15.
 */
public class Cat {

    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield");
        garfield.setFavoriteFood("lasagna");
        garfield.setAge(11);
        Cat pinkPanther = new Cat("Pink Panther");
        pinkPanther.setFavoriteFood("cake");
        pinkPanther.setAge(40);
        Cat catwoman = new Cat("Catwoman");
        catwoman.setFavoriteFood("wine");
        catwoman.setAge(25);

        System.out.println(isOlder(garfield, pinkPanther));

        makeBestFriends(garfield, pinkPanther);
        System.out.println(garfield.getFavoriteFood());
        System.out.println(pinkPanther.getFavoriteFood());

        System.out.println(makeKitten(garfield, catwoman).getName());

        Person pooja = new Person("Pooja");
        adoption(catwoman, pooja);
        System.out.println(catwoman.getOwner().getName());

        System.out.println(isFree(garfield) + garfield.getName());
        System.out.println(isFree(catwoman) + catwoman.getName());

        System.out.println(isSibling(garfield, catwoman) + "siblings");
    }

  private String name;
  private String favoriteFood;
  private int age;
  private Person owner;

  public Cat() {
  }

  public Cat(String name) {
    this.name = name;
  }

  public String getFavoriteFood() {
    return favoriteFood;
  }

  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public Person getOwner() {
    return owner;
  }

    public static boolean isOlder(Cat cat1, Cat cat2) {
       if (cat1.getAge() > cat2.getAge()) {
          return true;
       } else {
           return false;
       }
    }

    public static void makeBestFriends(Cat cat1, Cat cat2) {
        String favFood = "mac and cheese";
        cat1.setFavoriteFood(favFood);
        cat2.setFavoriteFood(favFood);
    }

    public static Cat makeKitten(Cat cat1, Cat cat2) {
        Cat kitten = new Cat(cat1.getName() + cat2.getName());
        kitten.setAge(0);
        return kitten;
    }

    public static void adoption(Cat adoptee, Person owner) {
        adoptee.setOwner(owner);
    }

    public static boolean isFree(Cat cat) {
        return cat.getOwner() == null;
    }

    public static boolean isSibling(Cat cat1, Cat cat2) {
        Person owner1 = cat1.getOwner();
        Person owner2 = cat2.getOwner();
        if (owner1 == null || owner2 == null) {
            return false;
        } else if (owner1.equals(owner2)) {
            return true;
        } else {
            return false;
        }
    }
}
