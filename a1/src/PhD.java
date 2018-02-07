package a1;

/** NetId: wx68, mh2394. Time spent: hh hours, mm minutes.
 *  An instance maintains info about the PhD of a person.
 */
public class PhD {
	private String name;		 /*Name of the person with a PhD, 
							 a String of length > 0*/
	private int month;	     /* month PhD was awarded. In 
							 range 12 with 1 being January, etc.*/
	private int year;        //year PhD was awarded
	private PhD advisor1;    //The first PhD advisor, null if unknown
	private PhD advisor2;    /*The second advisor of this person, 
							 null if unknown or the PhD has less than two advisors*/
	private int numAdvisees; //number of PhD advisees

	/**Group A: The first constructor and the getter/observer
	 *  methods of class PhD 
	 */ 
	
    /**Constructor: an instance for a person with name n, 
     * PhD month m, PhD year y. Its advisors are unknown, 
     * and it has no advisees. Precondition: n has 
     * at least 1 char and m is in 1..12. 
     */
	public PhD(String n, int m, int y) {
		assert n != null && n.length() >= 1;
		assert m >= 1 && m <= 12;
		name = n;
		month = m;
		year = y;
	}
	/**Return the name of this person*/
	public String name() {
		assert name != null && name.length() > 0;
		return name;
	}
	/**Return the month this person got their PhD*/
	public int month() {
		assert month >= 1 && month <= 12;
		return month;
	}
	/**Return the year this person got their PhD*/
	public int year() {
		return year;
	}
	/**Return the first advisor of this PhD 
	 * (null if unknown)
	 */
	public PhD advisor1() {
		return advisor1;
	}
	/**Return the second advisor of this PhD 
	 * (null if unknown or non-existent)
	 */
	public PhD advisor2() {
		return advisor2;
	}
	/**Return the number of PhD advisees of this person*/
	public int numAdvisees() {
		assert numAdvisees >= 0;
		return numAdvisees;
	}
	
	/**Group B: the setter/mutator methods. 
	 * Note: methods setAdvisor1 and setAdvisor2
	 * must change fields of both this PhD and its advisor 
	 * in order to maintain the class invariant
	 */
	
	/**Add p as the first advisor of this person.
	 * Precondition: the first advisor is unknown and p is not null.
	 */
	public void setAdvisor1(PhD p) {
		assert advisor1 == null && p != null;
		advisor1 = p;
		p.numAdvisees ++;		
	}
	/**Add p as the second advisor of this person.
	 * Precondition: The first advisor (of this person) is known, 
	 * the second advisor is unknown, p is not null, 
	 * and p is different from the first advisor.
	 */
	public void setAdvisor2(PhD p){
		assert advisor1 != null && advisor2 == null && p != null;
		advisor2 = p;
		p.numAdvisees ++;
	}
	
	/**Group C: Two more constructors. 
	 * The test procedure for group C has to create a PhD using
	 * the constructor given below. This will require first creating 
	 * two PhD objects using the first constructor and then checking 
	 * that the new constructor sets all 6 fields properly —and also 
	 * the number of advisees of adv1 and adv2.
	 */
	/**Constructor: a PhD with name n, PhD month m, PhD year y, 
	 * first advisor adv1, and no second advisor.
	 * Precondition: n has at least 1 char, m is in 1..12, 
	 * and adv1 is not null.
	 */
	public PhD(String n, int m, int y, PhD adv1) {
		
	}
	/**Constructor: a PhD with name n, PhD month m, PhD year y, first advisor 
	 * adv1, and second advisor adv2.
	 * Precondition: n has at least 1 char, m is in 1..12,
	 * adv1 and adv2 are not null, and adv1 and adv2 are different.
	 */
	public PhD(String n, int m, int y, PhD adv1, PhD adv2) {
		
	}
	/**Group D: Write three functions. 
	 * The second tests whether two people are “intellectual siblings”, 
	 * that is: they are not the same object and they have a non-null advisor in common. 
	 * Write these using only boolean expressions (with !, &&, and || and
	 * relations <, <=, ==, etc.). Do not use if-statements, conditional expressions,
	 * switches, addi- tion, multiplication, etc. 
	 * Each is best written as a single return statement.
	 */
	/**Return value of "this PhD has at least one advisee",
	 *i.e. true if this PhD has at least one advisee and false otherwise
	 */
	public boolean hasAdvisee() {
		return true;
	}
	/**Return value of "p is not null and this person got the PhD after p.”*/
	public boolean gotAfter(PhD p) {
		return true;
	}
	/**Return value of "this person and p are intellectual siblings."
	 * Precondition: p is not null.
	 */
	public boolean areSiblings(PhD p) {
		return true;
	}
}
