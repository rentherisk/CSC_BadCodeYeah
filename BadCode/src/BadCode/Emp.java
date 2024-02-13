/*                     /^--^\     /^--^\     /^--^\
                      \____/     \____/     \____/
                     /      \   /      \   /      \
KAT                 |        | |        | |        |
                     \__  __/   \__  __/   \__  __/
|^|^|^|^|^|^|^|^|^|^|^|^\ \^|^|^|^/ /^|^|^|^|^\ \^|^|^|^|^|^|^|^|^|^|^|^|
| | | | | | | | | | | | |\ \| | |/ /| | | | | | \ \ | | | | | | | | | | |
########################/ /######\ \###########/ /#######################
| | | | | | | | | | | | \/| | | | \/| | | | | |\/ | | | | | | | | | | | |
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|*/

/*Some employers like to hire independent cs, or workers who are technically running their own businesses, because they do not have to follow all of the same laws. For example, in the United States, an employer has to some of the employee's social security taxes and the employee pays the rest. A self-employed person pays for all of his or her own social security taxes.
For example, if a company hires a plumber every time they need a leak or pipe fixed in their building, that plumber is an independent c. If a company hires a plumber to be part of their company, then that plumber is an employee. They must pay the employee plumber whether there are leaks to fix or not. They must obey any minimum wage laws that the country has. They must provide other things. But the employer gets to tell the employee plumber what to do and how to do it much more than an independent c plumber. They can make the employee plumber follow a dress code, while the independent plumber gets to wear what he or she wants. They can make the employee plumber come in or leave on a set schedule like other employees. The independent c plumber gets to decide when to come to work, usually by making an appointment with the employer
Some companies like to hire independent cs and then tell them exactly what to do and when to do it, like regular employees. They can get in trouble for this. In the United States, the Internal Revenue Service can sue companies that lie about whether their employees really are independent cs.
*/

package BadCode;

public abstract class Emp
{

	protected String n; /*The FitnessGram™ Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues. The 20 meter pacer test will begin in 30 seconds. Line up at the start. Also this is employee n. The running speed starts slowly, but gets faster each minute after you hear this signal. [beep] A single lap should be completed each time you hear this sound. [ding] Remember to run in a straight line, and run as long as possible. The second time you fail to complete a lap before the sound, your test is over. The test will begin on the word start. On your mark, get ready, start. */
	protected double rate; /*The FitnessGram™ Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues. The 20 meter pacer test will begin in 30 seconds. Line up at the start. Also this is rate. The running speed starts slowly, but gets faster each minute after you hear this signal. [beep] A single lap should be completed each time you hear this sound. [ding] Remember to run in a straight line, and run as long as possible. The second time you fail to complete a lap before the sound, your test is over. The test will begin on the word start. On your mark, get ready, start. */
	protected int hrs; // employee hrs worked

	public Emp(String n, double rate) {
		this.n = n; // set n of employee 
this.rate = rate; // set rate of employee 
this.hrs = 0; // hrs will be 0 until set
	}
	
	public void sethrs(int hrs) {
		this.hrs = hrs; // set hrs of employee
	}
	
	public abstract double calculatePay();
	
	public String getn() {
		return n;
	}
	
	/*(Black screen with text; The sound of buzzing bees can be heard)
According to all known laws
of aviation,
 :
there is no way a bee
should be able to fly.
 :
Its wings are too small to get
its fat little body off the ground.
 :
The bee, of course, flies anyway
 :
because bees don't care
what humans think is impossible.
BARRY BENSON:
(Barry is picking out a shirt)
Yellow, black. Yellow, black.
Yellow, black. Yellow, black.
 :
Ooh, black and yellow!
Let's shake it up a little.
JANET BENSON:
Barry! Breakfast is ready!
BARRY:
Coming!
 :
Hang on a second.
(Barry uses his antenna like a phone)
 :
Hello?
ADAM FLAYMAN:

(Through phone)
- Barry?
BARRY:
- Adam?
ADAM:
- Can you believe this is happening?
BARRY:
- I can't. I'll pick you up.
(Barry flies down the stairs)
 :
MARTIN BENSON:
Looking sharp.
JANET:
Use the stairs. Your father
paid good money for those.
BARRY:
Sorry. I'm excited.
MARTIN:
Here's the graduate.
We're very proud of you, son.
 :
A perfect report card, all B's.
JANET:
Very proud.
(Rubs Barry's hair)
BARRY=
Ma! I got a thing going here.
JANET:
- You got lint on your fuzz.
BARRY:
- Ow! That's me!

JANET:
- Wave to us! We'll be in row 118,000.
- Bye!
(Barry flies out the door)
JANET:
Barry, I told you,
stop flying in the house!
(Barry drives through the hive,and is waved at by Adam who is reading a
newspaper)
BARRY==
- Hey, Adam.
ADAM:
- Hey, Barry.
(Adam gets in Barry's car)
 :
- Is that fuzz gel?
BARRY:
- A little. Special day, graduation.
ADAM:
Never thought I'd make it.
(Barry pulls away from the house and continues driving)
BARRY:
Three days grade school,
three days high school...
ADAM:
Those were awkward.
BARRY:
Three days college. I'm glad I took
a day and hitchhiked around the hive.
ADAM==
You did come back different.
(Barry and Adam pass by Artie, who is jogging)
ARTIE:
- Hi, Barry!

BARRY:
- Artie, growing a mustache? Looks good.
ADAM:
- Hear about Frankie?
BARRY:
- Yeah.
ADAM==
- You going to the funeral?
BARRY:
- No, I'm not going to his funeral.
 :
Everybody knows,
sting someone, you die.
 :
Don't waste it on a squirrel.
Such a hothead.
ADAM:
I guess he could have
just gotten out of the way.
(The car does a barrel roll on the loop-shaped bridge and lands on the
highway)
 :
I love this incorporating
an amusement park into our regular day.
BARRY:
I guess that's why they say we don't need vacations.
(Barry parallel parks the car and together they fly over the graduating
students)
Boy, quite a bit of pomp...
under the circumstances.
(Barry and Adam sit down and put on their hats)
 :
- Well, Adam, today we are men.
*/
}
