/*
 * Author: Buckley Wiley
 * Contact: buckley@buckleywiley.com
 * GitHub: https://github.com/BuckDaTruck
 */
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        art1();
        mes("\n" +
                "███╗░░██╗██████╗░░█████╗░  ███╗░░░███╗░█████╗░███╗░░██╗░█████╗░░██████╗░███████╗██████╗░  ░██████╗██╗███╗░░░███╗\n" +
                "████╗░██║██╔══██╗██╔══██╗  ████╗░████║██╔══██╗████╗░██║██╔══██╗██╔════╝░██╔════╝██╔══██╗  ██╔════╝██║████╗░████║\n" +
                "██╔██╗██║██████╦╝███████║  ██╔████╔██║███████║██╔██╗██║███████║██║░░██╗░█████╗░░██████╔╝  ╚█████╗░██║██╔████╔██║\n" +
                "██║╚████║██╔══██╗██╔══██║  ██║╚██╔╝██║██╔══██║██║╚████║██╔══██║██║░░╚██╗██╔══╝░░██╔══██╗  ░╚═══██╗██║██║╚██╔╝██║\n" +
                "██║░╚███║██████╦╝██║░░██║  ██║░╚═╝░██║██║░░██║██║░╚███║██║░░██║╚██████╔╝███████╗██║░░██║  ██████╔╝██║██║░╚═╝░██║\n" +
                "╚═╝░░╚══╝╚═════╝░╚═╝░░╚═╝  ╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝░╚═════╝░╚══════╝╚═╝░░╚═╝  ╚═════╝░╚═╝╚═╝░░░░░╚═╝");
        wait(2000);
        mes("\n" +
                "█▀ ▀█▀ █▀█ █▀█ █▄█ █░░ █ █▄░█ █▀▀   █▄▄ █▄█   █▀ ▄▀█ █▀▄▀█ ▄▀█ █▄░█ █▄█ █░█   █▀▀ ▄▀█ █▄░█ █▀▀ █▀ █░█\n" +
                "▄█ ░█░ █▄█ █▀▄ ░█░ █▄▄ █ █░▀█ ██▄   █▄█ ░█░   ▄█ █▀█ █░▀░█ █▀█ █░▀█ ░█░ █▄█   █▄█ █▀█ █░▀█ ██▄ ▄█ █▀█");
        wait(100);
        mes("\n" +
                "╔═══╗────╔╗────╔╗╔╗──────╔══╗──────╔╗─╔╗────────╔╗╔╗╔╗╔╗\n" +
                "║╔═╗║────║║────║║║║──────║╔╗║──────║║─║║────────║║║║║║║║\n" +
                "║║─╚╬══╦═╝╠══╦═╝║║╚═╦╗─╔╗║╚╝╚╦╗╔╦══╣║╔╣║╔══╦╗─╔╗║║║║║╠╣║╔══╦╗─╔╗\n" +
                "║║─╔╣╔╗║╔╗║║═╣╔╗║║╔╗║║─║║║╔═╗║║║║╔═╣╚╝╣║║║═╣║─║║║╚╝╚╝╠╣║║║═╣║─║║\n" +
                "║╚═╝║╚╝║╚╝║║═╣╚╝║║╚╝║╚═╝║║╚═╝║╚╝║╚═╣╔╗╣╚╣║═╣╚═╝║╚╗╔╗╔╣║╚╣║═╣╚═╝║\n" +
                "╚═══╩══╩══╩══╩══╝╚══╩═╗╔╝╚═══╩══╩══╩╝╚╩═╩══╩═╗╔╝─╚╝╚╝╚╩═╩══╩═╗╔╝\n" +
                "────────────────────╔═╝║───────────────────╔═╝║────────────╔═╝║\n" +
                "────────────────────╚══╝───────────────────╚══╝────────────╚══╝");
        wait(2000);
        mes("\n\n");
        randArt();
        mes("\n\n");
        start();
    }

    public static void start() {
        mes("You have 3 job offers to join NBA franchises as a GM.");
        wait(700);
        int choice = choice3("Choose Your Team!", "Bulls", "Warriors", "Heat");
        if (choice == 1) {
            firstPickBulls();
        } else if (choice == 2) {
            considerLoveWarriors();
        } else if (choice == 3) {
            considerRoseHeat();
        }
    }

    public static void randArt() {
        Random random = new Random();
        int myart = random.nextInt(18) + 1;

        switch (myart) {
            case 1:
                art1();
                break;
            case 2:
                art2();
                break;
            case 3:
                art3();
                break;
            case 4:
                art4();
                break;
            case 5:
                art5();
                break;
            case 6:
                art6();
                break;
            case 7:
                art7();
                break;
            case 8:
                art8();
                break;
            case 9:
                art9();
                break;
            case 10:
                art10();
                break;
            case 11:
                art11();
                break;
            case 12:
                art12();
                break;
            case 13:
                art13();
                break;
            case 14:
                art14();
                break;
            case 15:
                art15();
                break;
            case 16:
                art16();
                break;
            case 17:
                art17();
                break;
            case 18:
                art18();
                break;
        }
    }

    public static void considerLoveWarriors() {
        mes("Your team, Golden State, has the fourtheenth overall pick in the 2008 NBA draft. You want a big man and it's two days before the event.");
        wait(700);
        mes("You can bargain with Minnesota (who has the third pick) to swap spots in order to draft Kevin Love.");
        wait(700);
        mes("Despite Love's potential, you believe there are other options, so you postpone your decision until draft night.");
        wait(700);
        int considerLoveWarrior = choice2("Options:", "Bargain with Minnesota", "Postpone your decision");
        if (considerLoveWarrior == 1) {
            packageOfferWarriors();
        } else if (considerLoveWarrior == 2) {
            draftNightWarriors();
        }

    }

    public static void draftNightWarriors() {
        mes("On draft night, you know struggle between three options.");
        wait(700);
        mes("What do you do?");
        wait(700);
        int draftNightWarrior = choice3("Options:", "Draft Robin Lopez", "Draft Serge Ibaka, a projected second round pick", "Postpone again");
        if (draftNightWarrior == 1) {
            applyforBulls2();
        } else if (draftNightWarrior == 2) {
            sergePick();
        } else if (draftNightWarrior == 3) {
            clockRunsOut();
        }
    }

    public static void otherOffers() {
        newOpportunities();
    }

    public static void sergePick() {
        mes("You are fired after draft night for supposedly wasting your pick on a non-lottery prospect.");
        wait(700);
        mes("Ironically, Serge Ibaka develops into a reliable starter, and other organizations take note of your foresight. ");
        wait(700);
        mes("Do you consider other offers or retire to the Bahamas?");
        wait(700);
        int sergePicks = choice2("Options:", "Caymans", "Consider other offers");
        if (sergePicks == 1) {
            evenMoreOffers();
        } else if (sergePicks == 2) {
            otherOffers();
        }

    }

    public static void evenMoreOffers() {
        mes("Calls come flying in, as more and more organizations want you.");
        wait(700);
        mes("Do you completely cut off all communication, or re-enter the job market?");
        wait(700);
        int sergePicks = choice2("Options:", "Cut off communication", "Consider other offers");
        if (sergePicks == 1) {
            bahamas();
        } else if (sergePicks == 2) {
            otherOffers();
        }
    }

    public static void bahamas() {
        mes("You live out the rest of your live in luxury, although all alone");
        wait(700);
        mes("You're really a winter person, to be honest, so the summers in the Bahamas are unbearable.");
        wait(700);
        end();
    }

    public static void applyforBulls2() {
        mes("Lopez is just a role player, but not a terrible pick.");
        wait(700);
        mes("Surprisingly, the Chicago GM (who drafted Rose with the first pick) gets caught on tax evasion charges, and the position opens up. ");
        wait(700);
        mes("You admire Derrick Rose, and are considering applying for the job. ");
        wait(700);
        mes("Do you apply?");
        wait(700);
        int applyforBull2 = choice2("Options:", "Yes", "No");
        if (applyforBull2 == 1) {
            kevinLoveTrade();
        } else if (applyforBull2 == 2) {
            nextYearDraft();
        }
    }

    public static void nextYearDraft() {
        mes("Successful — you keep your job. Additionally, your team's frontcourt presence shines this season, leading the league in rebounds.");
        mes("The next season, however, you have an opportunity in the draft to move up and select international phenom Ricky Rubio or to select Davidson standout Stephen Curry.");
        mes("Who do you select as your franchise's point guard of the future?");
        wait(700);
        int nextYearDrafts = choice2("Options:", "Rubio", "Curry");
        if (nextYearDrafts == 1) {
            rubio();
        } else if (nextYearDrafts == 2) {
            dynastyWarriors();
        }
    }

    public static void rubio() {
        mes("Curry wins rookie of the year. You lose your job,");
        end();
    }

    public static void dynastyWarriors() {
        mes("You land Steph Curry in the 2009 draft. ");
        wait(700);
        mes("The Warriors dynasty begins. ");
        wait(700);
        mes("With the greatest shooter of all time on your team, the game of basketball becomes more and more positionless, entering a new era of game strategy.");
        end();
    }

    public static void packageOfferWarriors() {
        mes("Which package do you offer Minnesota in addition to swapping picks?");
        wait(700);
        int packageOfferWarrior = choice3("Options:", "Two future picks", "Blossoming SG Monta Ellis", "Fan-favorite PG Baron Davis, so you can draft a young PG ");
        if (packageOfferWarrior == 1) {
            nextYearDraft();
        } else if (packageOfferWarrior == 2) {
            mes("Minnesota accepts, but experts criticize your decision to trade away your supposed point guard of the future, Monta Ellis.");
            mes("Miami, however, recognize that you have an eye for young talent. They drafted Russell Westbrook in the most recent draft, and they hire you as their GM.");
            boshOrRuss();
        } else if (packageOfferWarrior == 3) {
            holdSendoff();
        }

    }

    public static void holdSendoff() {
        mes("Chicago accepts. ");
        wait(700);
        mes("Do you hold a sendoff for Davis at a home game?");
        wait(700);
        int holdSendoffs = choice2("Options:", "Yes", "No");
        if (holdSendoffs == 1) {
            nextYearDraft();
        } else if (holdSendoffs == 2) {
            openWindow();
        }
    }

    public static void openWindow() {
        mes("Davis locks you in your office and fills it with carbon monoxide.");
        wait(700);
        mes(" Do you open a window?");
        wait(700);
        int openWindows = choice2("Options:", "Yes", "No");
        if (openWindows == 1) {
            surviveAndRetire();
        } else if (openWindows == 2) {
            dead();
        }
    }

    public static void surviveAndRetire() {
        mes("You survive, but you quit and retire in the Cayman Islands out of frustration with your security team.");
        end();
    }

    public static void dead() {
        mes("You don't survive.");
        end();
    }

    public static void considerRoseHeat() {
        mes("Your team, Miami, has the second overall pick in the 2008 NBA draft.");
        wait(700);
        mes("It's two days before the event.");
        wait(700);
        int considerRoseHeats = choice2("Options:", "You can bargain with Chicago (who has the first pick) to swap spots, in order to draft Derrick Rose.", "Despite Rose's potential, you believe there are other options, so you postpone your decision until draft night and keep your pick.");
        if (considerRoseHeats == 1) {
            packageOfferHeat();
        } else if (considerRoseHeats == 2) {
            draftNightHeat();
        }
    }

    public static void draftNightHeat() {
        mes("On draft night, you struggle between three options.");
        wait(700);
        mes("What do you do?");
        wait(700);
        int packageOfferHeats = choice3("Options:", "Postpone again", "Draft Russell Westbrook", "Draft Michael Beasley");
        if (packageOfferHeats == 1) {
            clockRunsOut();
        } else if (packageOfferHeats == 2) {
            boshOrRuss();
        } else if (packageOfferHeats == 3) {
            applyforBulls1();
        }
    }

    public static void applyforBulls1() {
        mes("Beasley is just a role player, but not a terrible pick.");
        wait(700);
        mes("Surprisingly, the Chicago GM (who drafted Rose with the first pick) gets caught on tax evasion charges, and the position opens up.");
        wait(700);
        mes("You admire Derrick Rose, and are considering applying for the job.");
        wait(700);
        mes("Do you apply?");
        wait(700);
        int forBulls1 = choice2("Options:", "Yes", "No");
        if (forBulls1 == 1) {
            kevinLoveTrade();
        } else if (forBulls1 == 2) {
            bigThree();
        }
    }

    public static void bigThree() {
        mes("Mediocrity defines the Heat for a while, until LeBron and Chris Bosh express interest in joining Dwyane Wade. ");
        wait(700);
        mes("Do you veto the formation of this trio due to worries about cap space?");
        wait(700);
        int Three = choice2("Options:", "Yes", "No");
        if (Three == 1) {
            vetoed();
        } else if (Three == 2) {
            dynastyHeat();
        }
    }

    public static void vetoed() {
        mes("You are fired on the spot.");
        wait(700);
        mes("End of story.");
        wait(700);
        mes("WHO VETOES LEBRON AND CHRIS BOSH?");
        wait(700);
        mes("You are thrown in prison for your stupidity aka criminal negligence.");
        end();
    }

    public static void dynastyHeat() {
        mes("Miami wins three championships over the next five years.");
        wait(700);
        mes("Congrats!");
        wait(700);
        mes("Your executive style has launched professional basketball into the era of the super team.");
        end();
    }

    public static void boshOrRuss() {
        mes("Westbrook develops into an incredible player, but when his rookie contract expires, you also have the opportunity to sign Chris Bosh (there's no cap space available for LeBron, although he wants to sign). ");
        wait(700);
        mes("Who do you sign?");
        wait(700);
        int boshRuss = choice2("Options:", "Westbrook", "Bosh");
        if (boshRuss == 1) {
            coachingHire();
        } else if (boshRuss == 2) {
            whoToBlame();
        }
    }

    public static void coachingHire() {
        mes("The Wade-Westbrook duo is electric. ");
        wait(700);
        mes("They reach the Finals and lose, but things are looking up thanks to your leadership.");
        wait(700);
        mes("Do you hire a new head coach?");
        wait(700);
        int coachingHires = choice2("Options:", "Yes", "No");
        if (coachingHires == 1) {
            newCoach();
        } else if (coachingHires == 2) {
            championshipHeat();
        }
    }

    public static void newCoach() {
        mes("With a new coach who Wade's and Westbrook's competing ego's, your season goes off the rails.");
        wait(700);
        mes("The Heat fail to pull off even a playoff berth.");
        end();
    }

    public static void championshipHeat() {
        mes("Miami wins the championship the next year, with previous finals experience and a mostly returing core of players.");
        wait(700);
        mes("Congratulations!");
        end();
    }

    public static void whoToBlame() {
        mes("Without Westbrook, Bosh and Wade get bounced out in the first round, and Westbrook wins four consecutive MVPs after departing.");
        wait(700);
        mes("Who do you blame for the Bosh decision?");
        wait(700);
        int Blame = choice2("Options:", "Yourself", "The Owner");
        if (Blame == 1) {
            mediocrity();
        } else if (Blame == 2) {
            ownerBlamed();
        }

    }

    public static void ownerBlamed() {
        mes("You are fired.");
        wait(700);
        mes("Well, what did you expect?");
        end();
    }

    public static void clockRunsOut() {
        mes("The clock runs out, and your team has to forfeit its pick.");
        wait(700);
        mes("You are fired on the spot.");
        wait(700);
        mes("Do you step down in silence, or badmouth the rest of the front office in your final press conference?");
        wait(700);
        int clockRunsOuts = choice2("Options:", "Step down in silence", "Badmouth the front office");
        if (clockRunsOuts == 1) {
            newOpportunities();
        } else if (clockRunsOuts == 2) {
            blacklisted();
        }
    }

    public static void packageOfferHeat() {
        mes("Which package do you offer in addition to swapping picks?");
        wait(700);
        int packageOfferHeats = choice3("Options:", "Two future picks", "Dwyane Wade, your star SG fresh off of a title", "A veteran Shawn Marion well past his prime");
        if (packageOfferHeats == 1) {
            kevinLoveTrade();
        } else if (packageOfferHeats == 2) {
            steppingDown();
        } else if (packageOfferHeats == 3) {
            stayOrQuit();
        }
    }

    public static void stayOrQuit() {
        mes("Chicago decline. Do you quit  out of frustration or stay in your post?");
        wait(700);
        int stayQuit = choice2("Options:", "Stay", "Quit");
        if (stayQuit == 1) {
            mediocrity();
        } else if (stayQuit == 2) {
            newOpportunities();
        }
    }

    public static void mediocrity() {
        mes("You keep your job, but the next few years remain defined by mediocrity.");
        wait(700);
        mes("First round exit after first round exit after first round exit.");
        end();
    }

    public static void steppingDown() {
        mes("Chicago accept, but this trade leads to your firing, as Dwyane Wade wins Finals MVP for Chicago the next year.");
        wait(700);
        mes("Do you step down in silence, or badmouth the rest of the front office in your final press conference?");
        wait(700);
        int steppingDowns = choice2("Options:", "Step down in silence", "Badmouth the front office");
        if (steppingDowns == 1) {
            newOpportunities();
        } else if (steppingDowns == 2) {
            blacklisted();
        }
    }

    public static void blacklisted() {
        mes("Your profanity-filled theatrics have blacklisted you at all NBA events.");
        wait(700);
        mes("Do you wish now to coach little league or go back to college?");
        wait(700);
        int blacklist = choice2("Options:", "Little League", "College");
        if (blacklist == 1) {
            littleLeague();
        } else if (blacklist == 2) {
            college();
        }
    }

    public static void littleLeague() {
        mes("You coach little league. That's it. For the rest of your life.");
        end();
    }

    public static void college() {
        mes("You watch from your dorm room as your team go 82-0 the next season.");
        end();
    }

    public static void newOpportunities() {
        mes("A few years, later, you get another chance. Offers from both the Bucks and the Pacers are on the table.");
        wait(700);
        mes("Which do you take?");
        wait(700);
        int newOpportunity = choice2("Options:", "Pacers", "Bucks");
        if (newOpportunity == 1) {
            pacers();
        } else if (newOpportunity == 2) {
            bucks();
        }
    }

    public static void pacers() {
        mes("In 2010, your first year, you select Paul George in the lottery, who ends up winning Rookie of the Year. ");
        wait(700);
        mes("Congrats on a great pick! ");
        wait(700);
        mes("Things are looking bright in Indiana!");
        end();
    }

    public static void bucks() {
        mes("After a couple of mediocre years, you draft a young Greek player named Giannis Antetokounmpo. ");
        wait(700);
        mes("He's a relatively unknown prospect, but things are looking up in Milwaukee.");
        end();
    }

    public static void firstPickBulls() {
        mes("Your team, Chicago, has the first overall pick in the 2008 NBA draft.");
        wait(700);
        mes("You're on the clock with two options.");
        wait(700);
        int firstPickBull = choice2("Options:", "You can select the hometown phenom Derrick Rose, a standout at the University of Memphis.", "Concerned about Rose's ability to contribute immediately to your franchise, you tell your advisors that you plan to select another player.");

        if (firstPickBull == 1) {
            kevinLoveTrade();
        } else if (firstPickBull == 2) {
            twoOffersLeft();
        }
    }

    public static void kevinLoveTrade() {
        mes("Successful! You now have Derrick Rose!");
        wait(700);
        mes("After draft night concludes, the Memphis GM calls you with a trade offer.");
        wait(700);
        mes("He really wants Rose, since he played in Memphis during college, and would be acclimated to the environment.");
        wait(700);
        mes("They offer you Kevin Love, whom they selected with the 5th pick, as well as a second round pick in next year's draft for Rose.");
        wait(700);
        mes("Do you accept decline, or make a counter offer asking for another future pick? ");
        wait(700);
        int kevinLoveTrades = choice3("Options:", "Yes", "No", "Counter");
        if (kevinLoveTrades == 1) {
            twoOffersLeft();
        } else if (kevinLoveTrades == 2) {
            reprimandRose();
        } else if (kevinLoveTrades == 3) {
            apologyDecision();
        }
    }

    public static void apologyDecision() {
        mes("Memphis decline your counter, and Rose is unhappy that you considered trading him in the first place.");
        wait(700);
        mes("Do you apologize to him?");
        wait(700);
        int apologyDecisions = choice2("Options:", "Yes", "No");
        if (apologyDecisions == 1) {
            reprimandRose();
        } else if (apologyDecisions == 2) {
            rebuildOrLeave();
        }
    }

    public static void rebuildOrLeave() {
        mes("Rose sits out, and then refuses to play. No other team wants him, and the Bulls win 22 games that season.");
        wait(700);
        mes("You and the entire coaching staff lose their jobs. ");
        wait(700);
        mes("It's time for a rebuild.");
        wait(700);
        mes("Do you stay with the team?");
        wait(700);
        int rebuildOrLeaves = choice2("Options:", "Yes", "No");
        if (rebuildOrLeaves == 1) {
            lowestRecord();
        } else if (rebuildOrLeaves == 2) {
            couchWatch();
        }
    }

    public static void couchWatch() {
        mes("You are fired the next season, after your team achieve the lowest record in NBA history.");
        end();
    }

    public static void lowestRecord() {
        mes("You are fired the next season, after your team achieve the lowest record in NBA history.");
        end();
    }

    public static void twoOffersLeft() {
        mes("Your organization fires you on the spot but you still have two job offers on the table. ");
        wait(700);
        mes("Do you join the Warriors or the Heat?");
        wait(700);
        int twoOffersLeftw = choice2("Options:", "Warriors", "Heat");
        if (twoOffersLeftw == 1) {
            considerLoveWarriors();
        } else if (twoOffersLeftw == 2) {
            considerRoseHeat();
        }
    }


    public static void reprimandRose() {
        mes("Your decision pays off. ");
        wait(700);
        mes("Rose wins Rookie of the Year in a landslide, and finishes second in MVP voting.");
        wait(700);
        mes("In a press conference, however, Rose expresses his unhappiness with the front office for not surrounding him with a supporting cast.");
        wait(700);
        mes("He threatens to leave, claiming that his name is bigger than the team's.");
        wait(700);
        mes("Do you reprimand him or not?");
        wait(700);
        int reprimandRoses = choice2("Options:", "Yes", "No");
        if (reprimandRoses == 1) {
            starterDemand2();
        } else if (reprimandRoses == 2) {
            starterDemand1();
        }

    }

    public static void starterDemand1() {

        mes("Rose now believes he can get away with prioritizing himself over the team. ");
        wait(700);
        mes("He skips two days of mandatory practice to go on a skiing trip, and comes back with tendonitis in his left knee.");
        wait(700);
        mes("The first game of the season is approaching—Rose demands to be put in the starting lineup.");
        wait(700);
        mes("Do you comply?");
        wait(700);
        int starterDemand1s = choice2("Options:", "Yes", "No");
        if (starterDemand1s == 1) {
            injuredKnee();
        } else if (starterDemand1s == 2) {
            rebuildOrLeave();

        }
    }

    public static void injuredKnee() {
        mes("Rose goes down in the second quarter holding his knee. ");
        wait(700);
        mes(" It's later diagnosed as a patellar fracture.");
        wait(700);
        mes("He's out for the season, and the Bulls finish 12th in the eastern conference,");
        wait(700);
        mes("It's time for a rebuild.");
        wait(700);
        end();
    }

    public static void starterDemand2() {
        mes("Rose complies, luckily, and your team eventually reaches a Game 7 in the ECF against LeBron and the Cavs.");
        wait(700);
        mes("Rose reports slight irritation in his left knee, but demands to be put in the starting lineup. ");
        wait(700);
        mes("Do you comply?");
        wait(700);
        int starterDemand2s = choice2("Options:", "Yes", "No");
        if (starterDemand2s == 1) {
            careerEnder();
        } else if (starterDemand2s == 2) {
            conferenceLoss();
        }

    }

    public static void conferenceLoss() {
        mes("Rose sits out, and LeBron scores 53 to bounce out your team. ");
        wait(700);
        mes("The fans and media are  unhappy with your decision in a win-or-go-home situation.");
        wait(700);
        mes("You lose your job.");
        end();
    }

    public static void careerEnder() {
        mes("Rose goes down in the second quarter holding his knee.");
        wait(700);
        mes("It's later diagnosed as a patellar fracture. ");
        wait(700);
        mes("Experts project that he'll never be the same player that he was pre-injury.");
        wait(700);
        mes("It's time for a rebuild.");
        end();
    }

    public static void wait(int t) {
        try {
            Thread.sleep(t); // Sleep for 2 seconds (2000 milliseconds)
        } catch (InterruptedException e) {
            // Handle the InterruptedException if needed
        }

    }

    public static void mes(String m) {
        System.out.println(m);
    }

    public static void end() {
        wait(2000);
        randArt();
        wait(2000);
        mes("\n");
        mes("\n" +
                "╔════╦╗───────╔╗──────────────╔═╗────────╔╗──────────────╔╗\n" +
                "║╔╗╔╗║║───────║║──────────────║╔╝────────║║──────────────║║\n" +
                "╚╝║║╚╣╚═╦══╦═╗║║╔╗╔╗─╔╦══╦╗╔╗╔╝╚╦══╦═╗╔══╣║╔══╦╗─╔╦╦═╗╔══╣║\n" +
                "──║║─║╔╗║╔╗║╔╗╣╚╝╝║║─║║╔╗║║║║╚╗╔╣╔╗║╔╝║╔╗║║║╔╗║║─║╠╣╔╗╣╔╗╠╝\n" +
                "──║║─║║║║╔╗║║║║╔╗╗║╚═╝║╚╝║╚╝║─║║║╚╝║║─║╚╝║╚╣╔╗║╚═╝║║║║║╚╝╠╗\n" +
                "──╚╝─╚╝╚╩╝╚╩╝╚╩╝╚╝╚═╗╔╩══╩══╝─╚╝╚══╩╝─║╔═╩═╩╝╚╩═╗╔╩╩╝╚╩═╗╠╝\n" +
                "──────────────────╔═╝║────────────────║║──────╔═╝║────╔═╝║\n" +
                "──────────────────╚══╝────────────────╚╝──────╚══╝────╚══╝");
        wait(1000);
        mes("\n" +
                "███╗░░██╗██████╗░░█████╗░  ███╗░░░███╗░█████╗░███╗░░██╗░█████╗░░██████╗░███████╗██████╗░  ░██████╗██╗███╗░░░███╗\n" +
                "████╗░██║██╔══██╗██╔══██╗  ████╗░████║██╔══██╗████╗░██║██╔══██╗██╔════╝░██╔════╝██╔══██╗  ██╔════╝██║████╗░████║\n" +
                "██╔██╗██║██████╦╝███████║  ██╔████╔██║███████║██╔██╗██║███████║██║░░██╗░█████╗░░██████╔╝  ╚█████╗░██║██╔████╔██║\n" +
                "██║╚████║██╔══██╗██╔══██║  ██║╚██╔╝██║██╔══██║██║╚████║██╔══██║██║░░╚██╗██╔══╝░░██╔══██╗  ░╚═══██╗██║██║╚██╔╝██║\n" +
                "██║░╚███║██████╦╝██║░░██║  ██║░╚═╝░██║██║░░██║██║░╚███║██║░░██║╚██████╔╝███████╗██║░░██║  ██████╔╝██║██║░╚═╝░██║\n" +
                "╚═╝░░╚══╝╚═════╝░╚═╝░░╚═╝  ╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝░╚═════╝░╚══════╝╚═╝░░╚═╝  ╚═════╝░╚═╝╚═╝░░░░░╚═╝");
        wait(1000);
        mes("\n" +
                "╭━━━╮╭╮╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╭╮╱╱╱╱╱╱╭━━━╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━╮╱╱╱╱╱╱╱╱╱╱╱╭╮\n" +
                "┃╭━╮┣╯╰╮╱╱╱╱╱╱╱╱┃┃╱╱╱╱╱╱╱╱┃┃╱╱╱╱╱╱┃╭━╮┃╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭━╮┃╱╱╱╱╱╱╱╱╱╱╱┃┃\n" +
                "┃╰━━╋╮╭╋━━┳━┳╮╱╭┫┃╭┳━╮╭━━╮┃╰━┳╮╱╭╮┃╰━━┳━━┳╮╭┳━━┳━╮╭╮╱╭┳╮╭╮┃┃╱╰╋━━┳━╮╭━━┳━━┫╰━╮\n" +
                "╰━━╮┃┃┃┃╭╮┃╭┫┃╱┃┃┃┣┫╭╮┫┃━┫┃╭╮┃┃╱┃┃╰━━╮┃╭╮┃╰╯┃╭╮┃╭╮┫┃╱┃┃┃┃┃┃┃╭━┫╭╮┃╭╮┫┃━┫━━┫╭╮┃\n" +
                "┃╰━╯┃┃╰┫╰╯┃┃┃╰━╯┃╰┫┃┃┃┃┃━┫┃╰╯┃╰━╯┃┃╰━╯┃╭╮┃┃┃┃╭╮┃┃┃┃╰━╯┃╰╯┃┃╰┻━┃╭╮┃┃┃┃┃━╋━━┃┃┃┃\n" +
                "╰━━━╯╰━┻━━┻╯╰━╮╭┻━┻┻╯╰┻━━╯╰━━┻━╮╭╯╰━━━┻╯╰┻┻┻┻╯╰┻╯╰┻━╮╭┻━━╯╰━━━┻╯╰┻╯╰┻━━┻━━┻╯╰╯\n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃\n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯╱╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯");
        wait(1000);
        mes("\n" +
                "███████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n" +
                "█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░███░░░░░░░░░░░░░░█░░░░░░░░░░░░██████░░░░░░░░░░░░░░███░░░░░░░░██░░░░░░░░█\n" +
                "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀░░░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀░░░░████░░▄▀▄▀▄▀▄▀▄▀░░███░░▄▀▄▀░░██░░▄▀▄▀░░█\n" +
                "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░▄▀▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░▄▀▄▀░░████░░▄▀░░░░░░▄▀░░███░░░░▄▀░░██░░▄▀░░░░█\n" +
                "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░████░░▄▀░░██░░▄▀░░█████░░▄▀▄▀░░▄▀▄▀░░███\n" +
                "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░████░░▄▀░░░░░░▄▀░░░░███░░░░▄▀▄▀▄▀░░░░███\n" +
                "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░████░░▄▀▄▀▄▀▄▀▄▀▄▀░░█████░░░░▄▀░░░░█████\n" +
                "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░████░░▄▀░░░░░░░░▄▀░░███████░░▄▀░░███████\n" +
                "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░████░░▄▀░░████░░▄▀░░███████░░▄▀░░███████\n" +
                "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░▄▀▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░▄▀▄▀░░████░░▄▀░░░░░░░░▄▀░░███████░░▄▀░░███████\n" +
                "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀░░░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀░░░░████░░▄▀▄▀▄▀▄▀▄▀▄▀░░███████░░▄▀░░███████\n" +
                "█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░███░░░░░░░░░░░░░░█░░░░░░░░░░░░██████░░░░░░░░░░░░░░░░███████░░░░░░███████\n" +
                "███████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n" +
                "████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n" +
                "█░░░░░░░░░░░░░░███░░░░░░██░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░░░█░░░░░░█████████░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░████░░░░░░██████████░░░░░░█░░░░░░░░░░█░░░░░░█████████░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█\n" +
                "█░░▄▀▄▀▄▀▄▀▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀░░█░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░████░░▄▀░░██████████░░▄▀░░█░░▄▀▄▀▄▀░░█░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\n" +
                "█░░▄▀░░░░░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░░░█░░▄▀░░█████████░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░████░░▄▀░░██████████░░▄▀░░█░░░░▄▀░░░░█░░▄▀░░█████████░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█\n" +
                "█░░▄▀░░██░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░███░░▄▀░░█████████░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░██████░░▄▀░░██████████░░▄▀░░███░░▄▀░░███░░▄▀░░█████████░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███\n" +
                "█░░▄▀░░░░░░▄▀░░░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░███░░▄▀░░█████████░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░██████░░▄▀░░██░░░░░░██░░▄▀░░███░░▄▀░░███░░▄▀░░█████████░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███\n" +
                "█░░▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░███░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░█████░░░░▄▀░░░░████████░░▄▀░░██░░▄▀░░██░░▄▀░░███░░▄▀░░███░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░█████░░░░▄▀░░░░█████\n" +
                "█░░▄▀░░░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░███░░▄▀░░█████████░░▄▀░░░░░░░░░░███████░░▄▀░░██████████░░▄▀░░██░░▄▀░░██░░▄▀░░███░░▄▀░░███░░▄▀░░█████████░░▄▀░░░░░░░░░░███████░░▄▀░░███████\n" +
                "█░░▄▀░░████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░███░░▄▀░░█████████░░▄▀░░███████████████░░▄▀░░██████████░░▄▀░░░░░░▄▀░░░░░░▄▀░░███░░▄▀░░███░░▄▀░░█████████░░▄▀░░███████████████░░▄▀░░███████\n" +
                "█░░▄▀░░░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░███████░░▄▀░░██████████░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░░░▄▀░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░███████░░▄▀░░███████\n" +
                "█░░▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░███████░░▄▀░░██████████░░▄▀░░░░░░▄▀░░░░░░▄▀░░█░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░███████░░▄▀░░███████\n" +
                "█░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░███████░░░░░░██████████░░░░░░██░░░░░░██░░░░░░█░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░███████░░░░░░███████\n" +
                "████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");

    }

    public static int choice2(String m, String a, String b) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(m);
        wait(500);
        System.out.println("1. " + a);
        wait(500);
        System.out.println("2. " + b);
        wait(500);
        System.out.println("Enter the number of your choice:");
        int choice = 0;
        while (choice < 1 || choice > 2) {
            String input = myObj.next();
            if (input.matches("[1-2]")) {
                choice = Integer.parseInt(input);
            } else {
                mes("Invalid Choice.");
                mes("Please enter an integer 1-2.");
                choice = choice2na(m, a, b);
            }
        }
        randArt();
        wait(1000);
        return choice;
    }

    public static int choice3(String m, String a, String b, String c) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(m);
        wait(500);
        System.out.println("1. " + a);
        wait(500);
        System.out.println("2. " + b);
        wait(500);
        System.out.println("3. " + c);
        wait(500);
        System.out.println("Enter the number of your choice:");
        int choice = 0;
        while (choice < 1 || choice > 3) {
            String input = myObj.next();
            if (input.matches("[1-3]")) {
                choice = Integer.parseInt(input);
            } else {
                mes("Invalid Choice.");
                mes("Please enter an integer 1-3.");
                choice = choice3na(m, a, b, c);
            }
        }
        randArt();
        wait(1000);
        return choice;
    }

    public static int choice4(String m, String a, String b, String c, String d) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(m);
        wait(500);
        System.out.println("1. " + a);
        wait(500);
        System.out.println("2. " + b);
        wait(500);
        System.out.println("3. " + c);
        wait(500);
        System.out.println("4. " + d);
        wait(500);
        System.out.println("Enter the number of your choice:");
        int choice = 0;
        while (choice < 1 || choice > 4) {
            String input = myObj.next();
            if (input.matches("[1-4]")) {
                choice = Integer.parseInt(input);
            } else {
                mes("Invalid Choice.");
                mes("Please enter an integer 1-4.");
                choice = choice4na(m, a, b, c, d);
            }
        }
        randArt();
        wait(1000);
        return choice;
    }

    public static int choice2na(String m, String a, String b) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(m);
        System.out.println("1. " + a);
        System.out.println("2. " + b);
        System.out.println("Enter the number of your choice:");
        int choice = 0;
        while (choice < 1 || choice > 2) {
            String input = myObj.next();
            if (input.matches("[1-2]")) {
                choice = Integer.parseInt(input);
            } else {
                mes("Invalid Choice.");
                mes("Please enter an integer 1-2.");
                choice = choice2na(m, a, b);
            }
        }
        return choice;
    }

    public static int choice3na(String m, String a, String b, String c) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(m);
        System.out.println("1. " + a);
        System.out.println("2. " + b);
        System.out.println("3. " + c);
        System.out.println("Enter the number of your choice:");
        int choice = 0;
        while (choice < 1 || choice > 3) {
            String input = myObj.next();
            if (input.matches("[1-3]")) {
                choice = Integer.parseInt(input);
            } else {
                mes("Invalid Choice.");
                mes("Please enter an integer 1-3.");
                choice = choice3na(m, a, b, c);
            }
        }

        return choice;
    }

    public static int choice4na(String m, String a, String b, String c, String d) {

        Scanner myObj = new Scanner(System.in);
        System.out.println(m);
        System.out.println("1. " + a);
        System.out.println("2. " + b);
        System.out.println("3. " + c);
        System.out.println("4. " + d);
        System.out.println("Enter the number of your choice:");
        int choice = 0;
        while (choice < 1 || choice > 4) {
            String input = myObj.next();
            if (input.matches("[1-4]")) {
                choice = Integer.parseInt(input);
            } else {
                mes("Invalid Choice.");
                mes("Please enter an integer 1-4.");
                choice = choice4na(m, a, b, c, d);
            }
        }
        return choice;
    }


    public static void art1() {
        mes("____________________________________________________________________________░░______________________________________________________________________");
        wait(15);
        mes("__________________________________________________________░░░░▒▒▒▒░░░░░░░░░░░░░░░░▒▒▒▒░░░░░░________________________________________________________");
        wait(15);
        mes("__________________________________________________░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░__________________________________________________");
        wait(15);
        mes("______________________________________________░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒░░____________________________________________");
        wait(15);
        mes("________________________________________░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒░░________________________________________");
        wait(15);
        mes("____________________________________░░▒▒░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▓▓████▓▓▓▓██████████▓▓▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░____________________________________");
        wait(15);
        mes("__________________________________▒▒░░░░░░░░░░░░░░▒▒▓▓▓▓▓▓▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓██▓▓▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒__________________________________");
        wait(15);
        mes("______________________________░░░░░░░░░░░░░░▒▒▓▓▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░░░░░▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░______________________________");
        wait(15);
        mes("____________________________░░░░░░░░░░▒▒▓▓▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░░░▒▒▒▒▒▒▒▒██▓▓▒▒▒▒▒▒▒▒▒▒____________________________");
        wait(15);
        mes("__________________________▒▒▒▒░░░░▒▒▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒__________________________");
        wait(15);
        mes("________________________▒▒▒▒░░░░▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒________________________");
        wait(15);
        mes("______________________▒▒░░░░▒▒▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒░░____________________");
        wait(15);
        mes("____________________▒▒▒▒░░▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░▒▒▒▒▒▒░░░░▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒____________________");
        wait(15);
        mes("__________________▒▒▒▒▒▒▓▓░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒░░░░░░▒▒▓▓▓▓▒▒▒▒▓▓▓▓░░▓▓▓▓▓▓▓▓██▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒__________________");
        wait(15);
        mes("________________▒▒▒▒▒▒▓▓░░░░░░░░▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒░░▒▒▒▒▒▒▒▒░░░░▒▒▒▒░░░░░░▒▒▓▓▓▓░░░░▓▓▓▓▓▓▒▒▓▓▓▓░░▓▓▓▓██░░▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒________________");
        wait(15);
        mes("______________░░▒▒▒▒▒▒▒▒░░░░▒▒██▓▓▒▒▒▒▒▒▓▓░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒░░░░░░▒▒▓▓▓▓░░░░▓▓▓▓██▒▒▓▓▓▓░░▓▓▓▓▓▓▒▒▒▒██▒▒▓▓████▓▓▒▒▒▒▒▒▓▓▒▒▒▒______________");
        wait(15);
        mes("______________▒▒▒▒▒▒▒▒░░░░▒▒▓▓▒▒░░░░▒▒▓▓▓▓░░░░▓▓▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░▒▒▓▓▒▒▓▓▓▓░░░░▓▓▓▓██▒▒▓▓▓▓░░▓▓▓▓▓▓▓▓▒▒██▒▒▓▓██▒▒▓▓██▒▒▒▒▒▒▓▓▒▒░░____________");
        wait(15);
        mes("____________▒▒▒▒▒▒▒▒░░▒▒░░▓▓▓▓▓▓░░░░░░▓▓▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓██▒▒▓▓▓▓▓▓▒▒████▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▒▒____________");
        wait(15);
        mes("__________░░▒▒▓▓▒▒░░▒▒▒▒▒▒▒▒▓▓▓▓▒▒░░░░▓▓▒▒▓▓▒▒░░░░▒▒▓▓░░░░▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒▒▒▒▒▓▓▓▓▒▒░░▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓██▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▒▒__________");
        wait(15);
        mes("__________▒▒▓▓░░▒▒░░▒▒░░░░░░▓▓▓▓▓▓▒▒░░▓▓▒▒░░░░░░▓▓▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▒▒▓▓██▒▒▒▒██▓▓▒▒▒▒▒▒▒▒▒▒▓▓__________");
        wait(15);
        mes("________░░▓▓▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▓▓▓▓▒▒░░▒▒▒▒▒▒░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓██▒▒▒▒▓▓██▒▒▒▒▒▒▒▒▒▒▓▓▒▒________");
        wait(15);
        mes("________▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░░░░░▓▓▓▓▒▒▓▓▓▓▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░▒▒▒▒▒▒░░▒▒▓▓▓▓▒▒▒▒▓▓▓▓▒▒▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▓▓________");
        wait(15);
        mes("______░░▓▓▒▒▒▒▒▒▒▒░░░░▒▒░░▓▓░░▒▒▓▓▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██▒▒▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒______");
        wait(15);
        mes("______▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▓▓██▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓______");
        wait(15);
        mes("______▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓████▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒░░____");
        wait(15);
        mes("____░░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓____");
        wait(15);
        mes("____▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒░░▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒░░░░░░░░░░▒▒░░▒▒░░░░▒▒░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▒▒▓▓▓▓____");
        wait(15);
        mes("____▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓░░__");
        wait(15);
        mes("____▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░▒▒░░░░░░▒▒▒▒▒▒░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒__");
        wait(15);
        mes("__░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓__");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓__");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▓▓▓▓██████████████▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓__");
        wait(15);
        mes("__▒▒▒▒▒▒▓▓██████████▓▓▒▒▒▒░░░░░░░░░░░░░░░░░░▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓██████████▓▓▓▓▓▓▓▓░░");
        wait(15);
        mes("__▒▒▓▓████████▓▓▒▒░░░░▒▒░░░░▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒░░░░░░▒▒░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓██████▓▓▓▓░░");
        wait(15);
        mes("__▓▓████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒░░▒▒▒▒▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓████▓▓▒▒");
        wait(15);
        mes("__▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒░░░░▒▒░░▒▒░░░░░░░░▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓██░░");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓░░");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░░▓▓▓▓▓▓░░██▒▒▒▒▒▒▒▒▓▓░░░░▒▒▒▒▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓▓▓▓▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓░░▓▓▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓░░");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░░▒▒░░██▓▓░░██▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░░░░░▒▒▓▓▒▒██▓▓██▓▓▒▒▓▓▓▓██▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░██▒▒▓▓▒▒▓▓██▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓████▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓██▓▓▒▒▒▒▒▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓░░");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓▓░░▓▓▒▒████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░");
        wait(15);
        mes("__▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒░░▒▒░░▒▒▒▒▓▓██▓▓▓▓▓▓▓▓██▓▓▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓██▓▓▒▒████▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓__");
        wait(15);
        mes("__▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒░░▒▒░░▒▒▒▒████▓▓▓▓▓▓▓▓██▓▓▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▒▒████▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓__");
        wait(15);
        mes("____▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓░░░░██▓▓▒▒██▓▓▓▓▓▓▓▓▓▓████▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓__");
        wait(15);
        mes("____██▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▓▓░░██▓▓▒▒████▓▓▒▒████████▒▒██████▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓████▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒__");
        wait(15);
        mes("____▓▓██▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▓▓▓▓▒▒████▓▓▒▒██▓▓████▒▒██▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓░░__");
        wait(15);
        mes("____▓▓▓▓████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▒▒████▓▓▒▒████████▒▒██▓▓██▒▒▒▒██▓▓██▒▒▓▓▓▓██▒▒▒▒████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓____");
        wait(15);
        mes("____▒▒▓▓▒▒████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒░░▓▓▒▒████▓▓▒▒▒▒██████▒▒██▓▓▓▓████▓▓▓▓▒▒▓▓██▓▓▓▓▒▒▒▒████▓▓▓▓▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▒▒____");
        wait(15);
        mes("______▓▓▒▒▒▒████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓██▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓░░____");
        wait(15);
        mes("______▓▓▓▓▓▓▒▒████▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▒▒▓▓▒▒▓▓▓▓▓▓████▓▓▓▓▓▓______");
        wait(15);
        mes("______░░▓▓▓▓▓▓▒▒▓▓████▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▒▒______");
        wait(15);
        mes("________▓▓▓▓▓▓▓▓▒▒▓▓██████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▒▒████▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓________");
        wait(15);
        mes("________░░▓▓▓▓▓▓▓▓▓▓▒▒▓▓██████▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▓▓▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▒▒________");
        wait(15);
        mes("__________▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓██████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓__________");
        wait(15);
        mes("__________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓██████████▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░__________");
        wait(15);
        mes("____________▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒____________");
        wait(15);
        mes("______________▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓██████████████▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒______________");
        wait(15);
        mes("______________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓██████████▓▓██████████████████████▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░______________");
        wait(15);
        mes("________________▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒________________");
        wait(15);
        mes("__________________▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒__________________");
        wait(15);
        mes("____________________▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒____________________");
        wait(15);
        mes("______________________▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒______________________");
        wait(15);
        mes("________________________▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒________________________");
        wait(15);
        mes("__________________________▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒__________________________");
        wait(15);
        mes("____________________________░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░____________________________");
        wait(15);
        mes("______________________________░░▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░______________________________");
        wait(15);
        mes("__________________________________▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒__________________________________");
        wait(15);
        mes("______________________________________▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒░░____________________________________");
        wait(15);
        mes("__________________________________________▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░________________________________________");
        wait(15);
        mes("______________________________________________▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░____________________________________________");
        wait(15);
        mes("____________________________________________________▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░__________________________________________________");
        wait(15);
        mes("____________________________________________________________▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▒▒▒▒░░__________________________________________________________");
        wait(15);
        mes("____________________________________________________________________________________________________________________________________________________");
    }

    public static void art2() {
        mes("______________________██████████████____________________________________________________________________________________________________");
        wait(15);
        mes("____________________██▒▒▒▒▒▒▒▒░░░░▒▒██__________________________________________________________________________________________________");
        wait(15);
        mes("__________________██░░▒▒▒▒░░░░░░░░░░░░██______________________░░████████████____________________________________________________________");
        wait(15);
        mes("__________________██░░▒▒░░░░░░░░░░░░░░▒▒██____________________▓▓▓▓██▓▓██▓▓▓▓██__________________________________________________________");
        wait(15);
        mes("________________██░░▒▒▒▒░░░░░░░░░░░░░░░░██__________________██▓▓██████▓▓████████________________________________________________________");
        wait(15);
        mes("________________██▒▒▒▒░░░░░░░░░░░░░░░░░░██________________░░██▓▓██▓▓▓▓▓▓▒▒▒▒▒▒██________________________________________________________");
        wait(15);
        mes("________________██▒▒▒▒░░░░░░░░░░░░░░░░░░██________________░░██▓▓▓▓▓▓██▒▒▒▒██▒▒██________________________________________________________");
        wait(15);
        mes("________________██▓▓▒▒░░░░░░░░░░░░░░░░░░██________________░░██▓▓▓▓██▒▒▒▒▒▒▓▓▒▒▓▓██______________________________________________________");
        wait(15);
        mes("__________________██░░░░░░░░░░░░░░░░░░▓▓__________________░░██████▒▒▒▒▒▒▒▒▒▒▒▒▓▓________________________________________________________");
        wait(15);
        mes("____________________██▒▒▒▒▒▒░░░░░░░░██________________________▓▓▒▒▒▒▒▒▒▒▒▒██████________________________________________________________");
        wait(15);
        mes("______________________▓▓▓▓▓▓▓▓▓▓▓▓▓▓__________________________▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓██________________________________________________________");
        wait(15);
        mes("______________________██▒▒▒▒▒▒▒▒██________________________░░████▒▒▒▒▒▒▒▒▒▒▒▒████████████████__██████____________________________________");
        wait(15);
        mes("______________________██▒▒▒▒▒▒▒▒██__________________██████████░░██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░__░░████████____________________________");
        wait(15);
        mes("________________________██▒▒▒▒▒▒██________________████▒▒▒▒██▒▒██__████████__██████▒▒▒▒▒▒▒▒▒▒██░░____________████________________________");
        wait(15);
        mes("________________________██▒▒▒▒▒▒▒▒██__________████▒▒▒▒▒▒▒▒██▒▒▓▓██________██▒▒▒▒▒▒██▒▒▒▒▒▒▒▒██__________________▓▓████▓▓________________");
        wait(15);
        mes("________________________██▒▒▒▒▒▒▒▒▒▒██__██████▓▓▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒████████▒▒▒▒▒▒▒▒██▒▒▒▒▒▒██░░________________________████████████████__");
        wait(15);
        mes("________________________██▒▒▒▒▒▒▒▒▒▒██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒██▒▒▓▓▓▓██▓▓▓▓▓▓▓▓▓▓______________██▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒██");
        wait(15);
        mes("__________________________██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████____________▒▒████████______██▒▒▒▒▒▒▒▒██▓▓▓▓██__");
        wait(15);
        mes("__________________________██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒________▒▒▒▒▒▒██______________________░░████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒____");
        wait(15);
        mes("__________________________██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████▒▒▒▒██▒▒▒▒▒▒▒▒▒▒__░░████__▒▒▒▒▒▒██________________________________░░████████▓▓______");
        wait(15);
        mes("__________________________░░██▓▓▒▒▒▒▒▒▒▒▒▒▓▓██░░░░░░██▒▒██▒▒▒▒▒▒▒▒▒▒__██████__▒▒▒▒▒▒██__________________________________░░░░░░░░________");
        wait(15);
        mes("________________________________██████████__________████▒▒▒▒▒▒▒▒▒▒▒▒__██████__▒▒▒▒▒▒▒▒██________________________________________________");
        wait(15);
        mes("________________________________░░░░░░░░____________██▓▓▒▒▒▒▒▒▒▒▒▒▒▒__░░████__▒▒▒▒▒▒▒▒██________________________________________________");
        wait(15);
        mes("____________________________________________________██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░████__▒▒▒▒▒▒▒▒██________________________________________________");
        wait(15);
        mes("______________________________________________________██▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░████__▒▒▒▒▒▒▒▒██________________________________________________");
        wait(15);
        mes("______________________________________________________██▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░████__▒▒▒▒▒▒▒▒▓▓________________________________________________");
        wait(15);
        mes("______________________________________________________██▒▒▒▒▒▒▒▒▒▒▒▒__██████▒▒__▒▒▒▒██__________________________________________________");
        wait(15);
        mes("______________________________________________________██▒▒▒▒▒▒▒▒▒▒▒▒__████████__▒▒▒▒██__________________________________________________");
        wait(15);
        mes("______________________________________________________████▒▒▒▒▒▒▒▒▒▒____________▒▒▒▒██__________________________________________________");
        wait(15);
        mes("______________________________________________________██░░████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██__________________________________________________");
        wait(15);
        mes("____________________________________________________██▒▒▒▒░░__████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██__________________________________________________");
        wait(15);
        mes("__________________________________________________▓▓██░░▒▒▒▒▒▒░░░░▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓░░__________________________________________________");
        wait(15);
        mes("______________________________________________░░██▒▒▒▒██░░__▒▒▒▒▒▒____████▒▒▒▒▒▒▒▒██____________________________________________________");
        wait(15);
        mes("______________________________________________░░██▒▒▒▒▓▓▓▓░░__░░▒▒▒▒▒▒░░░░▓▓▓▓▓▓██░░____________________________________________________");
        wait(15);
        mes("______________________________________________██▒▒▒▒▒▒▒▒▒▒▒▒██▓▓____▒▒▒▒▒▒______██______________________________________________________");
        wait(15);
        mes("______________________________________________██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓░░__░░▒▒▒▒▒▒▒▒██______________________________________________________");
        wait(15);
        mes("____________________________________________██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓________██______________________________________________________");
        wait(15);
        mes("____________________________________________██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓▓▓▓▓▓▓██▓▓____________________________________________________");
        wait(15);
        mes("__________________________________________████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██____________________________________________________");
        wait(15);
        mes("__________________________________________██▓▓▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██____________________________________________________");
        wait(15);
        mes("________________________________________██▒▒__▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██____________________________________________________");
        wait(15);
        mes("______________________________________▒▒██▒▒__▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██____________________________________________________");
        wait(15);
        mes("______________________________________██████__▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒██____________________________________________________");
        wait(15);
        mes("__________________________________██████______▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒██____________________________________________________");
        wait(15);
        mes("________________________________██▒▒______▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██____________________________________________________");
        wait(15);
        mes("__________________________██████████▓▓▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██__________________________________________________");
        wait(15);
        mes("________░░██████____██████░░░░░░░░░░████▒▒__██▒▒▒▒▒▒▒▒▒▒▒▒████░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██__________________________________________________");
        wait(15);
        mes("________████████████░░░░░░░░░░__________██▒▒__████▒▒██████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██__________________________________________________");
        wait(15);
        mes("________████████████______________________▓▓░░░░██▓▓__████▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██__________________________________________________");
        wait(15);
        mes("______██████████████________________________██▓▓________██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██__________________________________________________");
        wait(15);
        mes("____██████████████████▓▓__________________▓▓░░____________▓▓▒▒▒▒▒▒▒▒██______▒▒▒▒▒▒▓▓░░__________________________________________________");
        wait(15);
        mes("____██████████████______██████████████████________________░░██▓▓▒▒▒▒▒▒▓▓▒▒________██____________________________________________________");
        wait(15);
        mes("__▓▓██████████░░________░░░░░░░░░░░░░░░░____________________░░░░▓▓▒▒▒▒██░░▒▒▒▒▒▒▒▒██____________________________________________________");
        wait(15);
        mes("__██████████░░____________________________________________________▓▓▒▒▒▒██______██______________________________________________________");
        wait(15);
        mes("__████████▒▒______________________________________________________░░██▓▓▒▒██████________________________________________________________");
        wait(15);
        mes("__████████____________________________________________________________░░████____________________________________________________________");
        wait(15);
        mes("__████████______________________________________________________________________________________________________________________________");
        wait(15);
    }

    public static void art3() {
        mes("▓▓▒▒▒▒▒▒▓▓▒▒▓▓██████████▓▓▓▓▒▒__░░▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓██");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▓▓██████████████▓▓▒▒░░▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓██████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓██");
        wait(15);
        mes("▒▒▒▒▒▒▓▓██████████████▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓██");
        wait(15);
        mes("▒▒▒▒██████████████▓▓░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓██████▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████▓▓▓▓▓▓▓▓██████████████████▓▓██████");
        wait(15);
        mes("▓▓██████████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████");
        wait(15);
        mes("██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████");
        wait(15);
        mes("██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████");
        wait(15);
        mes("████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████");
        wait(15);
        mes("▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓██▒▒████████▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████");
        wait(15);
        mes("██░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓██░░██▓▓░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████");
        wait(15);
        mes("░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓░░▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░████▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▒▒▓▓▓▓░░▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██▒▒████▓▓████████▓▓██░░▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓░░▓▓░░▒▒░░▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▒▒██████▓▓████████▒▒████▓▓▓▓▒▒▓▓▓▓▓▓▒▒██████▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒░░▒▒▒▒▓▓░░▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓████████▒▒██████▓▓▓▓██▓▓▓▓▓▓▒▒▓▓▓▓▒▒████████████▓▓░░▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▓▓▓▓▓▓██░░████▒▒▒▒████▓▓▓▓▓▓▒▒▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒░░▒▒░░▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒░░▒▒░░▒▒░░░░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░▓▓░░▓▓▓▓░░██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▓▓▒▒▒▒▓▓▒▒░░▒▒▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░░██▒▒▒▒██▓▓░░▒▒░░▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▓▓░░▒▒▒▒░░▓▓▓▓▓▓▒▒░░▓▓▒▒▒▒▓▓▓▓██▓▓▓▓██████▒▒░░▓▓████▒▒▒▒░░▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒░░▒▒▒▒░░░░▒▒░░▒▒▒▒▒▒▒▒░░▒▒░░▓▓██░░▒▒▓▓▓▓▓▓░░▓▓▓▓██▒▒████▓▓░░▒▒████▓▓░░▓▓░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓████████████");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓░░░░██▓▓░░▓▓▒▒▓▓▓▓▒▒▓▓▓▓▒▒__▓▓░░▓▓██▓▓▓▓▓▓▓▓▒▒██▓▓░░▒▒░░▓▓░░██▓▓▓▓▒▒▓▓░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██░░▓▓▒▒██▒▒▓▓░░▒▒▓▓██▒▒██▒▒██████▒▒▒▒░░▒▒██████████▒▒░░░░▒▒░░████▓▓▒▒▓▓▓▓▓▓▒▒░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▒▒▒▒▓▓████▒▒░░▒▒██▓▓████░░▒▒▓▓░░▓▓▒▒▓▓▓▓▒▒▓▓▒▒▒▒▓▓▒▒▓▓▓▓▓▓░░▓▓▒▒▓▓░░▒▒██▓▓░░██▓▓▓▓░░░░░░▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▒▒██▓▓████▒▒░░▓▓░░██▓▓▓▓▒▒░░▒▒▓▓░░░░▓▓▓▓▒▒▓▓░░██▓▓░░▓▓██▒▒██▓▓▒▒▓▓▒▒░░▓▓▓▓░░▓▓██__▒▒░░▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▒▒▓▓▓▓▓▓▓▓██▓▓▓▓░░▓▓░░▓▓▓▓▒▒▓▓▒▒░░▓▓▒▒▓▓░░░░▓▓▒▒▓▓▓▓▓▓██░░░░▓▓▓▓▓▓▒▒░░▓▓░░░░░░░░▒▒░░▒▒░░██░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▒▒░░▓▓▓▓▒▒▓▓░░▓▓▓▓▓▓▒▒▒▒░░▓▓▓▓▓▓▒▒▒▒░░▓▓▓▓▓▓░░░░▒▒░░▓▓▒▒▓▓▓▓▒▒░░██▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▒▒░░░░░░░░▒▒▒▒▒▒▓▓▓▓░░▓▓░░░░▓▓▓▓▓▓░░▓▓▒▒▓▓▒▒░░░░▓▓▓▓░░▓▓░░▓▓▓▓░░██▒▒__▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓░░▒▒▓▓▒▒░░░░▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░▒▒▓▓▒▒▓▓▒▒░░░░▓▓░░▓▓▓▓░░░░░░▓▓░░██▓▓__▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▓▓▒▒▓▓▒▒▒▒▒▒▓▓▒▒░░▓▓▓▓▒▒▓▓▒▒▓▓▒▒▓▓░░░░▓▓▓▓░░▒▒▓▓▓▓░░▒▒__░░░░▓▓░░▒▒░░░░██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▒▒▒▒▓▓▒▒░░▓▓▒▒▒▒░░░░░░▒▒▓▓▓▓▒▒▓▓▓▓░░▒▒▒▒▒▒▒▒▓▓▒▒░░▓▓▓▓▒▒▒▒░░░░▓▓░░▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒░░░░░░░░▒▒▓▓▒▒▒▒▒▒░░░░▓▓▓▓░░▓▓░░▒▒░░▒▒▒▒▒▒░░▒▒▒▒▓▓▓▓░░░░▒▒▓▓░░▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒░░▓▓░░░░░░▒▒▒▒░░▒▒░░░░░░░░░░▒▒▒▒░░▒▒▒▒░░▒▒▓▓▒▒▓▓▓▓▒▒░░▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("██████████████████░░▓▓▒▒▒▒▓▓▒▒░░░░▒▒▓▓▒▒░░▒▒▒▒▒▒░░▓▓░░__░░░░░░▒▒▓▓▓▓░░▓▓____░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("██████████████████▒▒▓▓▓▓▓▓░░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░░░▓▓░░▓▓░░░░▒▒░░░░░░░░▒▒▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("██████████████████▒▒░░▓▓▒▒░░▒▒▒▒▒▒▒▒▒▒░░▓▓▒▒▒▒▒▒▒▒░░░░▒▒░░░░░░░░░░▓▓▒▒░░▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("██████████████████▓▓▒▒▒▒░░▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░▓▓▓▓░░██__░░▓▓██████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("██████████████████░░░░▒▒▒▒░░▒▒▓▓▒▒░░▓▓▒▒▒▒▒▒▒▒░░▓▓▓▓▒▒░░░░░░▒▒░░▒▒▒▒░░░░░░▒▒██████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▒▒▒▒▓▓▒▒████▓▓▒▒░░██▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒▓▓▒▒░░▓▓░░░░░░▒▒░░░░░░██████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓██▓▓██▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▓▓▒▒▒▒▓▓▓▓▓▓▓▓░░▒▒▒▒▓▓▓▓██▓▓░░▓▓▓▓▓▓▓▓██░░░░▒▒░░▒▒░░░░▒▒████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▒▒░░▓▓▓▓▓▓░░▒▒▓▓▒▒▒▒▓▓▓▓▒▒▒▒▓▓░░██▓▓▓▓░░▓▓░░▓▓▒▒░░▒▒░░░░██████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████▒▒░░▒▒░░░░▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓░░▓▓░░▓▓▓▓░░▒▒▓▓__▒▒░░░░██████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████▒▒▒▒▓▓▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓██▓▓▒▒░░▓▓▓▓▒▒░░░░▒▒__▒▒░░████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████░░██▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒░░▓▓░░▒▒▓▓▓▓██▓▓▒▒▒▒░░▓▓░░▒▒▒▒░░▒▒░░░░▓▓██████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▒▒░░▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒░░▒▒░░░░▓▓░░░░██████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓████████████▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓░░██▒▒▓▓▓▓▓▓▓▓▓▓░░▓▓▒▒▒▒░░▓▓░░▒▒▒▒████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓██████████████▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓▓▓██▓▓▓▓▓▓░░▒▒▓▓▓▓██░░▓▓████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓████████████▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓██████████████▓▓██▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████▓▓▓▓▓▓▓▓████▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▒▒▓▓██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
    }

    public static void art4() {
        mes("██████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████▓▓▓▓▓▓▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████▓▓▓▓▒▒▒▒░░░░░░░░░░░░░░░░░░░░                ░░▓▓▓▓░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████▓▓▓▓▓▓▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░                  ▒▒▓▓▒▒      ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████▓▓▒▒░░░░░░░░░░░░░░  ░░                  ▓▓▓▓░░          ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████████▒▒░░░░░░  ░░                      ░░▓▓▓▓              ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓████████▒▒░░    ░░                      ░░▒▒▒▒                ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒░░░░████████▓▓░░░░░░                        ▒▒▒▒▒▒                  ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████");
        wait(15);
        mes("██████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░▒▒░░▒▒████████▒▒░░                          ▒▒▒▒▒▒                    ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████");
        wait(15);
        mes("██████████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒░░░░▒▒░░░░░░░░▓▓██▓▓██▓▓░░      ░░                  ▒▒▒▒░░                    ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████");
        wait(15);
        mes("████████▓▓▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒░░▒▒░░░░░░▒▒▓▓██▓▓██░░    ░░                    ▒▒▒▒░░                    ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓████████████████████████████████████████");
        wait(15);
        mes("██████▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░░░░░░░░▒▒░░░░░░░░▓▓▓▓▓▓▓▓░░                        ░░░░░░░░                      ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████");
        wait(15);
        mes("████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒░░▒▒░░░░░░░░▓▓▓▓▓▓▒▒▒▒    ░░                  ░░░░░░░░    ░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████");
        wait(15);
        mes("██▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒░░▒▒▒▒░░░░░░░░░░▒▒░░▓▓▒▒▒▒▒▒▓▓    ░░                  ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░░░░░░░▒▒░░░░░░▒▒░░▒▒▒▒▒▒░░▓▓    ░░              ░░▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒░░              ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░░░▒▒░░░░▒▒░░░░░░▒▒  ▒▒▒▒░░░░▓▓              ▒▒▒▒░░░░░░░░░░░░░░                      ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("██▓▓▓▓██▓▓▓▓▒▒▒▒▓▓▒▒▒▒▓▓▓▓▒▒▒▒▓▓▒▒░░░░▒▒▒▒▒▒▒▒░░░░▒▒▒▒░░░░░░░░░░▒▒░░▒▒░░▒▒░░░░░░▓▓  ░░    ▒▒░░      ░░░░▒▒░░▒▒▒▒                        ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒░░▒▒░░░░▒▒░░░░▒▒░░▒▒░░▒▒░░▒▒░░░░░░▒▒░░▒▒░░        ░░░░      ░░▒▒▒▒░░                      ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░░▒▒░░░░▒▒░░░░░░░░░░░░  ▒▒░░▒▒░░░░░░▓▓░░      ░░░░            ░░▓▓▒▒░░                      ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("▓▓██████████████████████████████████▓▓▒▒▒▒▒▒▒▒░░▒▒░░░░▒▒░░▒▒░░░░░░  ░░▒▒  ░░░░▓▓██░░      ░░░░  ░░      ░░      ░░▓▓▓▓░░                    ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████▒▒▒▒▒▒░░▒▒░░░░▒▒░░░░▒▒░░░░▒▒░░▒▒░░▓▓░░        ▒▒    ░░    ░░░░    ░░    ░░▓▓▓▓▓▓                    ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("██████████████████▓▓▓▓▓▓▓▓████████████████████▒▒▒▒▒▒░░▒▒░░░░▒▒░░▒▒░░  ▒▒▓▓▒▒▒▒▒▒░░░░      ▒▒    ░░░░    ░░    ░░    ░░▓▓▓▓▓▓                    ▒▒▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("██████▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓██████████████▓▓▒▒▒▒░░▒▒▒▒░░▒▒░░░░▒▒▓▓▓▓▓▓▓▓▒▒▒▒░░░░░░░░░░░░░░  ░░░░  ░░░░░░  ░░░░░░░░▓▓▓▓▓▓░░              ░░░░▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("██████████▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒██▓▓▒▒▒▒▓▓██████████████▒▒▒▒░░▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒░░░░░░▒▒▒▒░░░░    ░░░░  ░░░░  ░░░░░░  ▓▓██▓▓░░      ░░░░    ░░░░▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("██████▓▓████▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒▓▓████████████▒▒▒▒▒▒░░▒▒██▓▓▓▓██▓▓▓▓░░░░▒▒░░░░░░▒▒░░▒▒▒▒░░  ░░░░░░░░  ░░░░░░  ░░░░  ▓▓████▒▒  ░░  ░░░░░░░░░░▒▒▓▓▓▓▓▓▓▓▓▓████████████████████████████████");
        wait(15);
        mes("████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██▒▒▒▒▓▓▒▒░░▒▒▓▓██████████▒▒▒▒▓▓██████████▒▒░░▒▒░░░░  ░░░░░░▒▒▒▒▒▒▓▓░░  ▒▒░░▒▒░░░░░░░░░░  ░░░░░░▓▓████▓▓  ░░  ░░░░░░░░░░▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("████████▓▓██▓▓██▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓██████████████████▓▓░░░░▒▒░░░░░░▒▒░░▒▒░░░░▒▒▒▒▒▒▓▓▒▒  ░░░░▒▒  ░░  ░░░░  ░░░░░░▒▒████▓▓░░░░░░░░░░░░░░▓▓▓▓▓▓████████████████████████████████████");
        wait(15);
        mes("████▓▓████▓▓▓▓▓▓▓▓▒▒██▓▓▓▓▓▓▒▒██▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓██████████████▒▒░░▒▒▒▒░░░░▒▒░░░░▒▒░░▒▒░░▒▒▒▒▓▓▓▓▒▒▒▒░░░░░░░░░░▒▒  ░░▒▒  ░░░░░░░░██████▒▒░░░░░░░░░░▒▒████████████████████████████████████████");
        wait(15);
        mes("██████████▓▓▓▓██▓▓▓▓▓▓▓▓▒▒██▓▓▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒████████████▒▒░░▓▓░░░░░░▒▒░░▒▒▒▒░░▒▒░░░░░░▒▒▓▓▓▓▓▓▒▒░░░░░░▒▒░░░░▒▒░░░░▒▒  ░░░░▒▒░░▓▓████▓▓░░░░░░░░░░▓▓██████████████████████████████████████");
        wait(15);
        mes("██████▓▓████▓▓██▓▓▒▒▓▓▓▓▓▓▒▒▓▓▒▒██▓▓▒▒▒▒░░▓▓▒▒▒▒▓▓██████████████▒▒▓▓▒▒░░▒▒▒▒░░▒▒▒▒░░▒▒░░░░▒▒░░░░▓▓▓▓▓▓██░░░░▒▒░░░░░░░░▒▒░░░░░░░░░░░░▒▒░░▓▓████▓▓░░░░░░░░▒▒██████████████████████████████████████");
        wait(15);
        mes("████████████▓▓▓▓██████▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓████████████████▓▓░░░░▓▓▒▒░░▒▒░░▒▒▓▓░░▒▒▒▒░░▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒░░░░░░░░  ░░▒▒░░░░░░░░░░░░░░░░▒▒██████▒▒░░░░░░▓▓████████████████████████████████████");
        wait(15);
        mes("██████▓▓▓▓██████▓▓▓▓▓▓██▓▓▒▒▓▓▒▒██▒▒▓▓▓▓▒▒▓▓████████████▓▓████████▒▒▓▓▒▒░░▓▓░░▓▓▒▒░░▒▒▒▒░░▒▒▒▒░░░░▒▒██████▒▒▒▒▒▒  ▒▒▒▒░░░░░░▒▒░░░░▒▒░░░░░░░░▒▒██████▒▒░░▒▒▒▒████████████████████████████████████");
        wait(15);
        mes("████████████▓▓▓▓████▓▓▓▓▓▓▓▓██▓▓██▒▒▒▒▓▓▓▓██████████▓▓▒▒▓▓██████████▒▒▒▒▒▒░░▓▓▒▒▒▒▒▒░░▒▒▒▒░░▒▒░░░░░░▓▓██████▒▒░░▒▒░░▒▒▒▒▒▒░░░░▒▒░░░░▒▒░░░░░░░░▒▒██████▒▒▒▒▒▒▓▓██████████████████████████████████");
        wait(15);
        mes("████████▓▓████▓▓▓▓▓▓▒▒██▓▓▓▓▓▓▓▓▓▓▒▒██▓▓██████████▓▓▒▒▓▓▒▒▓▓████████▓▓░░▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒░░▒▒░░▒▒▒▒▒▒████████▒▒░░▒▒░░░░░░░░▒▒░░▒▒░░░░░░▒▒░░▒▒▒▒▒▒▓▓████▒▒▒▒▓▓██████████████████████████████████");
        wait(15);
        mes("██████████████▓▓████▓▓▓▓▓▓██▓▓▓▓▓▓▓▓████████████▒▒▓▓▒▒▓▓░░▒▒██████████▓▓▒▒▒▒░░▓▓▒▒▒▒▒▒▒▒░░▓▓░░▒▒▒▒▒▒▒▒▒▒██████▓▓▒▒▒▒░░▒▒░░░░▒▒▒▒░░▒▒░░▒▒░░▒▒░░▒▒▒▒▒▒▓▓████▒▒▒▒██████████████████████████████████");
        wait(15);
        mes("████████████████▓▓▓▓▒▒██▓▓▒▒▓▓██▓▓████████████▒▒▓▓▒▒▒▒▒▒██▒▒▓▓████████▓▓░░▒▒▓▓▒▒░░▓▓░░▒▒▒▒░░▓▓▒▒▒▒▒▒▒▒░░▓▓██████▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░░▒▒░░▒▒▒▒▒▒▓▓████▒▒██████████████████████████████████");
        wait(15);
        mes("██████████████▓▓██████▓▓▓▓██▓▓██████████████▓▓▒▒▓▓▒▒██▓▓▓▓▒▒▒▒██████████▓▓▒▒▒▒▒▒▒▒░░▓▓▒▒░░▓▓▒▒░░▒▒░░▒▒▒▒▒▒████████▒▒░░▒▒░░▒▒░░░░▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██▓▓▓▓████████████████████████████████");
        wait(15);
        mes("██████████████████▓▓▓▓████▓▓████████████▓▓▒▒▓▓▓▓██▓▓▓▓▓▓▒▒▓▓▒▒██████████▒▒▒▒▓▓▒▒▓▓▓▓▒▒▒▒▓▓▒▒░░▓▓░░▓▓▒▒▒▒▓▓▒▒██████▓▓▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██▓▓████████████████████████████████");
        wait(15);
        mes("██████████████▓▓██▓▓██▓▓██████████████▓▓▒▒██▓▓▒▒▓▓▓▓▒▒▓▓▒▒▓▓▓▓▓▓████████▓▓▒▒▒▒▒▒▒▒░░▓▓▒▒░░▒▒▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████████████████████████████████");
        wait(15);
        mes("████████████████████▓▓██████████████▓▓▓▓██▒▒▓▓██▓▓▒▒██▓▓██▓▓▒▒▒▒██████████▓▓▒▒▓▓░░▓▓▒▒░░▓▓▒▒▒▒▒▒▒▒░░▒▒░░▒▒▒▒▒▒████████▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████▓▓██▓▓▒▒██▓▓▒▒██▓▓▓▓▒▒▓▓▒▒██▓▓██████████▒▒▒▒▒▒▓▓▒▒░░██▒▒▒▒▒▒░░▒▒▓▓▒▒▓▓░░▓▓▒▒▓▓██████▓▓▓▓▒▒▒▒▒▒▓▓░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████▒▒████▓▓▓▓▒▒██▓▓▒▒▓▓▓▓▓▓██▓▓▒▒▓▓████████▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒▓▓▒▒▓▓▒▒▒▒▓▓▒▒▓▓▒▒▒▒▒▒████████▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████████████████████████████");
        wait(15);
        mes("██████████████████████████████▓▓▓▓██▓▓▓▓▓▓██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▒▒██▓▓██████████▒▒▒▒▓▓▓▓▒▒▒▒██▒▒▒▒▒▒░░▒▒▒▒░░▒▒░░▓▓░░▒▒██████▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████████████████████████████");
        wait(15);
        mes("████████████████████████████▓▓████▓▓████▓▓▓▓▒▒██▓▓▒▒▓▓▓▓▓▓██▓▓▓▓▒▒██████████▒▒▓▓▒▒░░▓▓▓▓▒▒▒▒▒▒▓▓██▓▓▓▓▓▓▒▒██░░▓▓▒▒████████▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████▓▓██████▓▓▓▓██▓▓██▓▓▒▒▓▓▓▓▓▓██████████▒▒▒▒▓▓▓▓▒▒░░██▓▓▓▓▒▒▒▒▒▒░░▒▒▒▒▒▒▓▓▒▒▓▓▒▒████████▓▓▒▒▒▒▓▓▒▒▓▓▒▒▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓██████████████████████████████");
        wait(15);
        mes("██████████████████████████████████▓▓████▓▓▓▓████▓▓▓▓▓▓▓▓██▓▓██▓▓▓▓▓▓████████▓▓██▓▓▒▒▓▓▓▓▒▒▒▒▓▓░░██▓▓██▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓██████▒▒▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓██████████████████████████████");
        wait(15);
        mes("████████████████████████████▓▓████████▓▓████▓▓██▓▓██▓▓████▒▒▓▓▒▒▓▓▓▓████████▓▓▓▓▒▒▓▓▓▓▒▒▒▒██▒▒██▒▒▒▒▒▒▓▓▓▓▓▓▒▒██▒▒▓▓▒▒████████▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓██████████████████████████████");
        wait(15);
        mes("██████████████████████████████▓▓████████████████▓▓▓▓▒▒██▓▓██████████████████████▓▓▓▓▒▒██▓▓▓▓▓▓▒▒▓▓▓▓██▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████▓▓██████▓▓████████▓▓▓▓▓▓▒▒██▒▒██████████▓▓▒▒██▓▓▒▒██▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓████▒▒▓▓▒▒▓▓▓▓████████▓▓▒▒▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████▓▓██▓▓██████▓▓▓▓▓▓████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒██▒▒▓▓▒▒▓▓▒▒██▓▓██▒▒▒▒▓▓██████▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████▓▓██▓▓██████████▓▓██▒▒██▓▓██████████▓▓▒▒██▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▒▒▒▒▓▓▓▓██▒▒████████▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████▓▓██▓▓████████████████████████████▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓██▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████▓▓████████████▓▓██▓▓▓▓████████████▓▓██▓▓██▓▓▓▓██▓▓██▓▓▓▓██▓▓██▒▒▓▓▓▓▓▓██▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████▓▓████████████████████████████████▓▓▓▓▓▓██▓▓▓▓▓▓▒▒▓▓▓▓▓▓██▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██▓▓██████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████████▓▓████████████████▓▓████████████▓▓██▓▓████▒▒██▓▓██████▓▓██▒▒▓▓▓▓▓▓██▓▓██▓▓██▓▓████████▓▓██▓▓▓▓▓▓▓▓▓▓██▓▓████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████████████████▓▓████████████████████████████▓▓████████████▓▓▓▓██████▓▓██▒▒██████▓▓▓▓██████████▓▓████▓▓▓▓██▓▓██████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████████████████████████████████████████▓▓██▓▓██████▓▓██▓▓██▓▓██▓▓██▓▓▓▓██████▓▓██▓▓██▓▓████████▓▓██████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████████████████████████████████████████████████▓▓████▓▓████████████████▓▓██▓▓████▓▓▓▓██████████████▓▓██████████████████████████████████████████████████");
    }

    public static void art5() {
        mes("██████████████████████████████████████████████████████▓▓▒▒░░▓▓▓▓▓▓▓▓▒▒▒▒▒▒██████████████████████████████████████████▓▓▒▒██▓▓▒▒██████████████████████████████████████████████████████░░▓▓▓▓██████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒██████████████████████████████████████████████████████████████████████████████████████████████████████████▒▒██▓▓▓▓████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████████████████████████████████████████████████████▓▓████▓▓▓▓▓▓████████");
        wait(15);
        mes("████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████████████████████████████████████████▓▓▓▓▓▓██████████████████▓▓████████");
        wait(15);
        mes("████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓████████████▒▒██▓▓████████████████████████████████████████▓▓▓▓██████████████████▓▓▓▓▓▓▓▓████████████████▓▓██████");
        wait(15);
        mes("████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓██████████████████████▓▓▒▒██████████░░██░░██▒▒██████████████████████████████▒▒░░░░▒▒▒▒██████████████████████▓▓▓▓▓▓████████████████▓▓▓▓▓▓");
        wait(15);
        mes("████████████████████████████████████████████████████████▓▓▒▒▒▒░░██████████████████████▓▓▒▒▒▒░░▓▓████░░▒▒░░██▒▒████████████████████████▓▓░░    ░░▒▒▒▒▒▒██████████████████████▓▓▓▓▓▓▓▓████████████▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████████████████████████████████████████████▓▓▓▓▒▒░░██████████████████████████▒▒▒▒▒▒░░▒▒▒▒░░░░░░▓▓██████████████████▓▓░░▒▒  ░░▒▒▒▒▒▒▒▒░░░░██████████████████████████▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████████████████████████████████████████████▒▒▓▓▒▒▒▒▒▒██████████████████████████▓▓▒▒▒▒░░▒▒░░░░░░▒▒██████████████████▓▓░░▒▒▒▒▒▒▒▒▒▒██▒▒░░▒▒████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████████████████████████████████████████████▒▒▓▓▒▒▓▓░░██████████████████████████████▒▒▓▓▒▒▒▒░░░░░░██████████████████▒▒▒▒▒▒▓▓▓▓  ░░████▒▒░░██████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████████████████████████████████████████████▒▒▓▓▒▒▒▒▒▒░░██████████████████████████████▓▓▓▓▒▒▓▓░░░░██████████████████▓▓░░░░▓▓▓▓▓▓▒▒▓▓▓▓░░▒▒██████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████");
        wait(15);
        mes("████████████████████████████████████████████████████████▒▒▓▓▒▒▒▒▒▒░░▓▓██████████████████████████████▒▒▓▓▒▒▒▒░░████████████████████▓▓▓▓▓▓▓▓  ░░▓▓▓▓▒▒░░▓▓████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒████████████████████████████████▒▒▓▓▒▒░░▓▓██████████████████▒▒  ▓▓▓▓▓▓▒▒▓▓▓▓░░░░▓▓████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████▒▒▓▓▓▓▒▒▓▓▓▓▒▒░░████████████████████████████████▓▓▓▓▓▓▒▒░░▒▒████████████████▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓░░▓▓████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████▒▒▓▓▓▓▒▒▓▓▓▓▒▒░░▓▓████████████████████████████████▓▓▓▓▒▒░░░░░░██████████████░░  ▒▒▓▓▓▓▒▒░░▓▓▓▓░░▓▓████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒██████████████████████████████████▒▒▒▒░░░░░░░░████████████▓▓▓▓▓▓▓▓    ░░▓▓▓▓▒▒▓▓████████████████████████████████████████▓▓▓▓▓▓██");
        wait(15);
        mes("████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▒▒████████████████████████████████████▒▒░░░░░░░░▒▒██████████▓▓░░▓▓▓▓▓▓▒▒░░▓▓▓▓░░▒▒▒▒▒▒▓▓████████████████████████████▓▓▓▓██████████");
        wait(15);
        mes("████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓░░██████████████████████████████████▓▓▒▒▒▒░░░░░░    ▓▓██████▓▓▓▓▓▓▓▓    ░░▓▓▒▒▒▒░░░░▒▒▓▓▒▒██████████████████████████████████████▓▓");
        wait(15);
        mes("████████████████████████████████████████████████████▓▓▓▓██▓▓▓▓████▓▓▓▓▒▒▓▓██▒▒▓▓▓▓▓▓████████████████████████▒▒▒▒░░▒▒▒▒░░░░  ░░████▓▓░░▒▒▓▓▓▓████▒▒░░░░░░  ▒▒▓▓▓▓▒▒██████████████████████████████▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████████████████████████████████████████▓▓▓▓▓▓▓▓██████▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒▒▒▓▓██████████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░  ██▓▓▓▓██████████▒▒░░░░░░▒▒░░▒▒▓▓▒▒██████████████████████████████▓▓▓▓████");
        wait(15);
        mes("████████████████████████████████████████████████████▒▒▓▓▓▓▓▓██████▓▓▓▓▒▒▒▒██░░▓▓▒▒▒▒▒▒▓▓████████████████████▒▒▓▓▒▒░░██▒▒▒▒▒▒▒▒░░  ░░▒▒██████████░░▒▒▒▒▒▒▒▒░░▒▒▓▓▓▓██████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████████████▒▒▓▓▓▓▒▒▒▒▓▓██▒▒▓▓▒▒▒▒▓▓░░▒▒▒▒▒▒░░▓▓██████████████▓▓░░░░▒▒▓▓▒▒░░████▒▒▒▒▒▒▒▒▒▒  ░░  ▒▒████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓██████████████████████████████████████");
        wait(15);
        mes("██████▓▓▓▓████████▓▓▓▓████████████████████████████▓▓▓▓▓▓▒▒░░░░░░▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒██████████████▒▒░░▒▒▒▒▒▒▓▓▒▒▓▓██████▓▓▒▒▒▒▒▒▒▒▒▒░░░░░░▓▓▓▓████▓▓▓▓░░░░▓▓▓▓████████████████████████████████████████");
        wait(15);
        mes("██████████████████████▓▓██████████████████████████▒▒▓▓▒▒▒▒██▓▓▒▒▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▓▓██▓▓▓▓██████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓████████████▒▒▒▒▒▒▒▒▒▒░░░░░░▓▓▓▓▓▓▒▒░░░░▒▒██████████████████████▓▓████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████▒▒▓▓▓▓▒▒██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒▓▓████████████████▓▓▒▒▓▓▒▒░░░░    ▒▒░░▒▒░░░░░░▓▓▓▓▓▓██████████████████████████████████████");
        wait(15);
        mes("██████████████▓▓████████████████████████████████▓▓▓▓▓▓▒▒▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██████████████████████▒▒▓▓▒▒░░    ░░░░░░░░░░      ░░██████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████▒▒  ▒▒▒▒████▓▓░░▓▓▓▓▒▒██████████▓▓▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░▒▒▒▒░░▒▒▓▓██▓▓▓▓▒▒██████████████████████████▓▓▓▓▓▓░░░░    ░░▒▒░░░░      ░░░░▒▒██████████████████████████████████");
        wait(15);
        mes("████████████████████████████████░░░░▒▒▒▒▓▓▓▓██░░▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓██████████████████████████████░░▓▓░░      ░░            ░░░░    ████████████████████████████████");
        wait(15);
        mes("▓▓▓▓██████████████████████▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▓▓▒▒▒▒▒▒▒▒▓▓▓▓████████████████████████████████░░░░░░░░▒▒░░░░    ░░░░      ░░░░░░  ██████████████████████████████");
        wait(15);
        mes("░░▒▒▒▒▓▓▓▓████████████▓▓████░░▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓  ▒▒▒▒▒▒▒▒▓▓██████████████████████████████████▒▒    ░░▒▒▒▒▒▒░░░░░░      ░░░░▒▒▒▒░░  ▓▓██████████████████████████");
        wait(15);
        mes("░░      ▒▒  ░░░░▒▒▓▓▓▓████▒▒▓▓▓▓▓▓██████▒▒▓▓▓▓▒▒▒▒████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ░░▒▒▒▒░░▒▒▓▓██████████████████████████████████▒▒  ░░░░░░░░░░░░░░░░      ░░▓▓▒▒▒▒░░░░  ▓▓████████████████████████");
        wait(15);
        mes("▒▒░░░░      ▒▒      ░░      ████▒▒▓▓▓▓██▓▓▒▒▓▓▓▓▓▓▒▒▒▒████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░  ▒▒▒▒██████████████████████████████████▒▒    ░░▒▒▒▒░░▒▒▒▒  ░░    ░░▓▓▒▒▒▒▒▒▒▒░░░░░░██████████████████▓▓░░");
        wait(15);
        mes("██████████▓▓██░░░░          ██▒▒░░▒▒▓▓░░  ▒▒▓▓▓▓▓▓▒▒▒▒██████████████████▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒████████████████████████████████████  ░░░░▒▒░░▒▒░░▒▒░░░░      ░░██▒▒▒▒▒▒▒▒░░░░  ▒▒▓▓██████████▒▒▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓██████████████▓▓▒▒▒▒██▒▒░░██░░    ▓▓▓▓▓▓▒▒▒▒░░░░▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓████████████████████████████░░░░░░░░▒▒▒▒░░▒▒      ░░░░▒▒████▒▒▒▒▒▒▒▒░░░░░░░░░░    ░░░░▒▒▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▒▒▒▒    ▒▒▒▒▓▓▒▒▒▒▒▒  ▒▒▒▒▒▒░░  ▒▒░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒████████████████████████████████████░░░░▒▒▒▒░░░░▓▓▒▒░░  ░░    ██████████▒▒▒▒▒▒░░░░░░░░░░░░▒▒▒▒▒▒▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒░░    ▒▒▓▓▓▓▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒  ░░      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒████████████████████████████████████  ░░░░░░░░░░░░            ██████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓");
        wait(15);
        mes("██████▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒░░░░░░▓▓▓▓▓▓▒▒▒▒░░▒▒▒▒▒▒░░░░░░░░    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓██████████████████████████░░░░░░░░░░░░░░░░          ██████████████▓▓░░▒▒░░▒▒▒▒░░░░░░▒▒░░▓▓");
        wait(15);
        mes("████  ▓▓██████▓▓▓▓████████▓▓██████░░▒▒░░░░░░░░▒▒▒▒▒▒    ██▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░▒▒▒▒▒▒▒▒▓▓▓▓████████████▒▒░░░░░░░░░░░░      ░░    ██████████████░░    ░░  ▓▓░░░░░░▓▓░░▓▓");
        wait(15);
        mes("████████████████▓▓██████▒▒██████▓▓░░▒▒▒▒░░░░░░░░░░░░    ▓▓██▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ░░░░░░░░░░░░░░░░░░░░░░▒▒██████████▓▓░░░░░░░░░░    ░░          ████████████▒▒▒▒▒▒▒▒░░▓▓▒▒░░░░▓▓▒▒▓▓");
        wait(15);
        mes("████████████████▓▓██████████████▓▓▒▒▒▒▒▒░░░░░░░░░░░░    ▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████▓▓▓▓▓▓▒▒░░░░░░░░            ░░░░████████████░░░░░░░░░░░░░░░░░░░░░░    ████████████▒▒▒▒▒▒▒▒░░▓▓▒▒▒▒  ▒▒▒▒▓▓");
        wait(15);
        mes("▓▓████████████████████████████████░░░░▒▒░░░░░░░░░░░░      ▒▒██████████▓▓▓▓████████████████████▓▓▓▓████▓▓▓▓▓▓██▓▓▓▓▒▒▒▒░░░░░░░░████████████░░░░░░░░░░░░░░░░          ░░██████████▓▓░░▓▓░░▒▒▒▒▓▓░░  ░░▒▒▒▒");
        wait(15);
        mes("██████████▓▓▓▓██▓▓▓▓▓▓▓▓▓▓████████▒▒▒▒▒▒░░░░░░░░░░░░░░    ████████████▓▓▓▓▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████▓▓░░░░░░░░░░░░░░░░░░      ░░██████████▓▓░░▓▓░░▒▒░░▓▓░░  ░░▓▓▒▒");
        wait(15);
        mes("████▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░  ████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████░░░░░░░░░░░░░░░░  ░░░░    ██████████▓▓  ▓▓░░▓▓░░▓▓▒▒▒▒██████");
        wait(15);
        mes("████▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████░░░░░░░░░░░░░░░░░░░░  ▓▓██████████▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓░░████▓▓██████████████████░░░░░░░░░░░░░░░░░░          ██████████  ▓▓▒▒████████████████");
        wait(15);
        mes("██████▓▓██████████▓▓▓▓▓▓▓▓▓▓██▓▓████░░░░░░░░░░░░░░░░░░░░  ▒▒████████▓▓░░▒▒██▓▓██████▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓████████▓▓██▓▓░░████████████▓▓▓▓██▒▒░░░░  ░░░░░░░░      ░░    ▓▓██████████████████████████▓▓██");
        wait(15);
        mes("▓▓██████████████████████▓▓██████████░░░░░░░░░░░░░░░░░░░░░░▒▒████████▓▓░░▒▒██▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓██▓▓████▓▓░░░░▒▒░░░░░░░░        ░░  ░░██████████████████████████████");
        wait(15);
        mes("████████████████████▓▓████████▓▓████░░░░░░░░░░░░░░░░░░░░░░▒▒██████████▒▒▒▒██▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████░░░░░░░░░░        ░░▒▒      ██████████████████████████████");
        wait(15);
        mes("██████████████▓▓████▓▓▓▓▓▓████▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░▒▒██▓▓▒▒▓▓██▓▓▓▓██▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓████████████████████████  ░░                ░░      ▓▓████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓░░░░░░░░░░▒▒▒▒░░░░░░░░░░▒▒▓▓▓▓░░▒▒▓▓████▓▓████▓▓▓▓██▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓  ▒▒▒▒████████████████▓▓████▒▒░░░░░░  ░░░░░░    ░░░░      ░░████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░  ░░░░░░▒▒░░▒▒░░░░░░▓▓▓▓▓▓▓▓▒▒▒▒████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓██▓▓░░░░░░▒▒░░░░░░░░░░░░        ▒▒████████████████████████▓▓██");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██████████████████████▓▓▓▓▓▓██▓▓░░░░░░░░      ░░    ░░░░░░  ▒▒▓▓████████████████▓▓████▓▓██");
        wait(15);
        mes("██▓▓██▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░░░▒▒▒▒▒▒▒▒░░░░░░░░▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓████████████████▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓████████▓▓▓▓████████████▓▓▓▓██░░░░▒▒▒▒░░░░░░░░░░░░░░░░░░  ▓▓▒▒██████████████████████████");
        wait(15);
        mes("▓▓████▓▓▓▓██▓▓██████▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒▓▓▓▓██▓▓▒▒▓▓▓▓▓▓▓▓████████▓▓████▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████░░░░░░░░▒▒▒▒▒▒░░░░░░░░░░░░  ░░▒▒██████████████████████████");
        wait(15);
        mes("██████▓▓████▓▓██▓▓████▓▓▓▓██▓▓▓▓████░░░░░░░░░░░░░░░░░░░░▓▓▓▓████████▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓████████████████████████▒▒░░░░░░░░░░░░▒▒░░░░▒▒░░░░    ▒▒██████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░▒▒▒▒▒▒░░░░░░░░▒▒██████████████▓▓██████▓▓██▓▓▓▓▓▓▓▓██▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████▓▓░░░░░░░░▒▒▒▒▒▒░░░░░░░░░░  ▓▓██████████████████████████");
    }

    public static void art6() {
        mes("░░░░░░░░░░░░░░░░░░░░░░░░██████████████████        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░████████████████████        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░████████████████████          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████████████████      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████████████      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████████          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████████                ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████                    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████                        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████                    ▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████                  ▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████                  ▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████            ▓▓▓▓▓▓▓▓      ▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████                ▓▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████                    ▓▓▓▓        ▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████                    ▓▓            ▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████                    ▓▓            ▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████                  ▓▓            ▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████    ░░              ▓▓        ▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████████                ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████████████              ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████████████████████████            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░████████████████████████████          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████  ████  ██    ██████  ██          ▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████    ██  ██  ██  ██  ██  ██        ▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░██████  ██    ██    ████      ████      ▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░████  ████  ██  ██  ██  ██  ██████      ▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░██  ████  ██    ████  ██  ████████    ▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("▒▒░░▒▒▒▒░░░░░░▒▒░░░░░░▒▒██████▓▓██▓▓▓▓████▓▓██▓▓██████████░░▓▓▓▓▒▒░░░░░░▒▒▒▒░░░░▒▒░░░░░░");
    }

    public static void art7() {
        mes("____________________________________██████████████████__________________________________");
        wait(15);
        mes("________________________________████__________________████______________________________");
        wait(15);
        mes("______________________________██__________________________██____________________________");
        wait(15);
        mes("____________________________██______________________________██__________________________");
        wait(15);
        mes("__________________________██____________░░____________________██________________________");
        wait(15);
        mes("__________________________██____░░____________________░░________██______________________");
        wait(15);
        mes("________________________██____░░______░░________________░░______██______________________");
        wait(15);
        mes("________________________██____░░____░░░░______░░__________░░______██____________________");
        wait(15);
        mes("________________________██__░░____░░░░░░______░░____░░____░░______██____________________");
        wait(15);
        mes("______________________██__░░░░__░░░░░░░░____░░░░░░__░░______░░____██____________________");
        wait(15);
        mes("______________________██░░__░░__░░░░░░░░░░__░░░░░░__░░______░░____██____________________");
        wait(15);
        mes("________________________██__░░░░░░░░░░░░░░__░░░░░░░░░░______░░░░__██____________________");
        wait(15);
        mes("________________________██__░░░░████░░░░░░░░░░████░░░░░░__░░____░░██____________________");
        wait(15);
        mes("__________________________████░░████░░░░░░░░░░████░░░░░░__░░██__██______________________");
        wait(15);
        mes("__________________________██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░__██______________________");
        wait(15);
        mes("__________________________██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██________________________");
        wait(15);
        mes("__________________________██░░░░░░░░░░██░░░░██░░░░░░░░░░░░░░████________________________");
        wait(15);
        mes("____________________________██░░░░░░░░░░████░░░░░░░░░░░░████__██________________________");
        wait(15);
        mes("______________________________████░░░░░░░░░░░░░░░░░░████__▓▓____________________________");
        wait(15);
        mes("__________________________________██████████████████____██______________________________");
        wait(15);
        mes("________________________________██░░▒▒██░░░░██▒▒▓▓__██__________________________________");
        wait(15);
        mes("______________________________██░░██▒▒▒▒████▒▒▒▒__██░░██________________________________");
        wait(15);
        mes("____________________________██░░░░██▓▓▓▓▒▒▓▓▓▓▓▓__██░░░░██______________________________");
        wait(15);
        mes("__________________________██░░░░██▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓██░░░░░░██____________________________");
        wait(15);
        mes("________________________██████████▓▓▓▓______▒▒▓▓▒▒░░██░░░░░░██__________________________");
        wait(15);
        mes("______________________████░░▒▒░░██▒▒▓▓▓▓▓▓__▓▓▓▓▓▓░░████░░░░██__________________________");
        wait(15);
        mes("______________________██▒▒░░▒▒░░██░░▒▒▓▓__▓▓▒▒▓▓░░░░██░░░░██____________________________");
        wait(15);
        mes("____________________██░░░░▒▒░░▒▒██░░▓▓▓▓▒▒▓▓▓▓▓▓░░██░░░░██______________________________");
        wait(15);
        mes("____________________██▒▒▒▒▒▒▒▒▒▒████▓▓▒▒▓▓▓▓▓▓▒▒████░░░░██______________________________");
    }

    public static void art8() {
        mes("██████████████▓▓▓▓▓▓▒▒      ░░▒▒▓▓▒▒░░░░▒▒▒▒░░▓▓▒▒  ░░▓▓██▓▓▓▓▓▓▒▒░░▒▒██████████████▓▓▓▓▓▓▓▓  ▒▒▓▓▓▓▓▓▓▓████████████████▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████");
        wait(15);
        mes("████████████████▓▓▓▓▒▒        ▒▒▓▓▒▒░░▒▒▒▒▒▒    ░░▓▓▓▓▓▓▓▓▒▒▒▒██▒▒▒▒▓▓▓▓██████████▓▓▓▓▓▓▒▒░░░░▒▒▒▒▓▓▓▓▓▓████████▓▓██▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒██████████");
        wait(15);
        mes("████████████████▓▓▓▓▓▓░░░░    ░░▒▒▒▒░░░░░░▒▒▓▓▓▓▒▒▓▓████▓▓░░▒▒░░▒▒▓▓▒▒▒▒██████████▓▓▓▓▒▒▒▒      ░░▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████");
        wait(15);
        mes("██████████████████▓▓▓▓▓▓▒▒░░░░░░▒▒░░░░▒▒▒▒░░░░████████████░░▒▒▒▒██▒▒░░▓▓████████▓▓▓▓░░▒▒░░░░      ░░▒▒▓▓▓▓▒▒▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████");
        wait(15);
        mes("████████████████████▓▓▓▓▓▓▓▓▒▒▒▒░░    ░░▒▒▒▒▓▓▓▓██████████▓▓░░▒▒▒▒░░██████████▓▓▓▓▓▓▒▒▒▒▒▒  ░░    ░░▒▒▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████");
        wait(15);
        mes("██████████████████████▓▓▓▓▓▓▓▓▓▓▒▒░░      ▒▒▓▓▓▓████████████░░▒▒░░░░████████▓▓▓▓▓▓░░▒▒▒▒▒▒▒▒░░    ░░▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████");
        wait(15);
        mes("██████████████████████████▓▓▓▓▓▓▓▓▒▒░░    ░░▓▓▓▓████████████░░▒▒░░████████▓▓▓▓░░  ░░▒▒▓▓░░▓▓▒▒░░░░▒▒▒▒▓▓▓▓████▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████");
        wait(15);
        mes("████████████████████████████▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒▒▒▓▓████████████░░▒▒▒▒▒▒████▓▓▒▒░░      ▒▒▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████");
        wait(15);
        mes("████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓██████████▒▒░░░░░░░░▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████▓▓██");
        wait(15);
        mes("████████████████████████████████████▓▓▓▓▓▓▓▓▓▓████████████████████▓▓██████▒▒░░▓▓▒▒▓▓▓▓░░░░▓▓▓▓▓▓██████████████████▒▒▓▓▓▓██████████████████████▓▓██████▓▓▓▓");
        wait(15);
        mes("██████████████████████████████████████████████▓▓██████████████████████████▒▒░░▓▓▓▓▒▒▒▒▒▒▒▒████████████████▓▓██████████████████████████████▓▓██████████████");
        wait(15);
        mes("████████████████████████████▓▓████████████████████████████████████████████▒▒▒▒██▒▒░░██▒▒▓▓████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████▓▓████████████████████████████████████▒▒░░▒▒▓▓▒▒▒▒▒▒████████████████████████████████▓▓████▓▓██████████████████████████");
        wait(15);
        mes("██████████████████████████████████████▓▓██▓▓██████████████████████████████▒▒░░  ░░░░░░▒▒░░░░▒▒▓▓▒▒▒▒▒▒▒▒██▓▓██████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████████████▒▒░░  ░░  ▒▒░░░░░░░░▒▒░░▒▒░░░░▓▓░░▓▓████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████████████▒▒░░▒▒░░░░▒▒  ▒▒░░░░▒▒░░▒▒░░░░▓▓░░▓▓    ████████████████████████████████████████");
        wait(15);
        mes("▒▒████████████████████████████████████████████████████████████████████    ▒▒░░  ░░████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██▓▓      ▓▓██████████████████████████████████████████████████████████▒▒██    ░░░░  ▓▓████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓██▓▓██▒▒    ░░██████████████████████████████████████████████████████░░██░░░░      ██████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████▓▓▓▓▓▓██▒▒    ░░▓▓██████████████████████████████████████████████▒▒▓▓░░░░░░    ██████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓██████████▓▓██▓▓██▒▒    ▒▒██████████████████████████████████████████▒▒██░░░░▒▒▓▓▒▒▓▓████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▒▒  ▓▓▓▓████████▒▒▓▓▓▓▓▓██░░    ▓▓████████████████████████████████████▒▒██▓▓▓▓▒▒░░    ██████████████████████████████████████▓▓▒▒██████████████████████████");
        wait(15);
        mes("██████▓▓▒▒▒▒▒▒██▓▓██▓▓▓▓▓▓▓▓██▓▓░░  ▒▒▒▒████████████████████████████▓▓▒▒░░  ░░  ░░░░    ████████████████████████████████████░░  ▓▓████████████████████████");
        wait(15);
        mes("██▓▓████████▒▒▒▒░░▒▒▓▓██▓▓▓▓▓▓▓▓████▓▓▒▒░░░░░░░░░░▓▓██████▒▒░░██████▓▓▒▒░░              ████████████████████████████████████░░░░▒▒██████████████████████▓▓");
        wait(15);
        mes("▓▓██▓▓▓▓▓▓▒▒██████▓▓░░  ▒▒▓▓██████▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒▒▒▒▒██████▓▓▒▒      ░░░░    ░░████████████████████████████████████▒▒░░  ▓▓██▓▓▒▒░░░░░░░░░░░░░░");
        wait(15);
        mes("████████▓▓████▓▓████████▓▓░░  ░░▓▓▓▓████████▓▓▓▓▓▓▓▓██▒▒▓▓▒▒░░▒▒░░  ░░▒▒▒▒        ░░░░░░  ██████████████████████████████▓▓▒▒▒▒▒▒▒▒░░  ░░▒▒▒▒▓▓████████████");
        wait(15);
        mes("▓▓████████████▓▓▓▓████▓▓▓▓▓▓██▓▓░░  ░░▓▓▓▓████████████    ░░▒▒  ░░▒▒▓▓██▓▓░░      ▒▒░░▒▒██░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓▓▓▓░░  ▓▓██████████████▓▓");
        wait(15);
        mes("▓▓▓▓▓▓████████████████▓▓▒▒▓▓██████████▓▓▒▒▒▒░░░░░░▒▒▒▒░░          ▒▒▓▓▓▓▓▓▓▓      ▓▓▓▓░░░░  ██████████████████████████▒▒▒▒██▒▒▒▒▓▓▓▓▒▒░░▒▒████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▒▒▒▒▒▒▓▓██▓▓▓▓▓▓██▓▓░░▓▓▒▒▒▒░░  ▒▒▓▓████▒▒░░░░▓▓▓▓▓▓██▓▓▓▓▒▒██████████████▓▓████████████████░░▒▒▓▓░░░░██████████████████");
        wait(15);
        mes("▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ▒▒░░  ▓▓██▓▓▒▒▒▒▓▓▓▓▓▓░░░░██████▓▓▒▒████████████████████████████████▒▒▒▒░░▒▒▓▓██████████████████");
        wait(15);
        mes("▓▓██▓▓▓▓▓▓▓▓████▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓██████████████████▓▓▓▓░░▒▒▒▒  ▓▓████████▒▒▓▓▓▓▒▒▒▒░░██████▓▓░░██████▓▓████████▓▓██████████▓▓▒▒░░▓▓▒▒▒▒██░░░░░░░░▒▒  ▓▓░░");
        wait(15);
        mes("██▓▓▓▓▓▓▓▓██████████▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▓▓        ▒▒▓▓██████▓▓▓▓▓▓▓▓▒▒▒▒    ░░▓▓▒▒              ░░░░░░▓▓      ░░  ▒▒▓▓▓▓▓▓██▓▓██████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓██▓▓▓▓▓▓████▓▓██▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓░░░░▒▒▒▒░░▒▒████████▓▓▒▒▒▒▓▓░░▒▒████████▓▓████████████████▒▒▓▓████████████▓▓▓▓▓▓▒▒████▒▒▒▒██████████");
        wait(15);
        mes("▓▓██▒▒██▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓██████████████▒▒▓▓          ░░████████▓▓▒▒██▓▓░░▒▒░░▒▒████▓▓▒▒██████████▒▒▒▒▓▓▒▒▒▒██████████▓▓▓▓▒▒▒▒████▓▓▒▒██████████");
        wait(15);
        mes("▓▓▓▓▓▓▒▒▓▓▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓████▓▓████░░██          ▒▒▓▓▓▓▓▓██▓▓████▓▓▒▒▒▒░░▓▓██▓▓▓▓░░██████████▓▓▒▒▒▒▒▒▓▓██████████▓▓▓▓▒▒▒▒▓▓████████████████");
        wait(15);
        mes("▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▒▒██▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒    ░░    ████▓▓▒▒██▓▓██████▓▓▒▒▒▒▓▓████▓▓░░▓▓████████▓▓▓▓▒▒▒▒██▒▒████████▓▓▓▓▓▓▒▒▒▒▒▒░░░░▒▒▒▒██████");
        wait(15);
        mes("▒▒░░▓▓▓▓▒▒▒▒▓▓▒▒▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒░░▓▓▒▒▓▓▒▒▓▓██▓▓▓▓▒▒░░  ░░    ▓▓████▓▓▓▓░░██▒▒██▓▓░░▒▒▒▒████████▓▓▓▓████▓▓▓▓▓▓▒▒▓▓▒▒██████████▒▒▓▓▒▒▓▓▒▒▒▒▓▓▓▓▓▓██████▓▓");
        wait(15);
        mes("▒▒▒▒▓▓░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒    ░░▓▓▓▓▓▓▓▓▒▒▓▓██░░██▓▓  ▒▒▓▓██████████▓▓▓▓██▒▒██▓▓▓▓▓▓▒▒████▓▓████▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓░░▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▒▒▓▓▒▒▒▒▒▒░░▒▒▓▓▓▓▓▓▒▒▒▒▓▓░░▒▒▒▒░░▒▒░░▓▓▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓░░░░▒▒▒▒██▓▓░░░░▒▒▓▓▓▓████▓▓▓▓▓▓▓▓░░██▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓██████▓▓▓▓██▓▓▓▓░░████▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▒▒▓▓▒▒▓▓▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒▓▓░░░░▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓░░░░  ▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓██░░▓▓▓▓██▓▓██▓▓▓▓");
    }

    public static void art9() {
        mes("██████████████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▓▓      ░░░░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒    ░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████░░      ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░  ░░▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░  ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒");
        wait(15);
        mes("████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░░░░░░░░  ▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓▒▒▒▒▓▓▓▓▓▓▒▒░░▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▒▒");
        wait(15);
        mes("██████████████████░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓██▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒██▒▒");
        wait(15);
        mes("██████████████▓▓▒▒▒▒░░  ██▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒██▒▒██▒▒▓▓▒▒▓▓▓▓▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓▒▒");
        wait(15);
        mes("██████████████▓▓▒▒▒▒▒▒  ██▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒░░▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓░░▓▓▓▓▓▓▒▒██▓▓▓▓▒▒▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░  ▓▓▓▓▒▒");
        wait(15);
        mes("██████████████▓▓▓▓▒▒▒▒░░▓▓░░▓▓▓▓▓▓░░░░▒▒▒▒░░░░▒▒▒▒▒▒░░░░░░░░░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒░░░░░░▒▒▓▓▒▒▒▒████▒▒▒▒▓▓░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░░░▓▓▓▓");
        wait(15);
        mes("██████████████▓▓▓▓▓▓▒▒  ██░░▓▓░░░░▒▒▓▓▒▒░░▒▒▒▒▒▒░░      ░░▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒░░▒▒▓▓▒▒░░▒▒░░  ▒▒░░▓▓░░▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓  ▓▓▓▓");
        wait(15);
        mes("██████████████▓▓▓▓▒▒▒▒  ▓▓░░░░░░▓▓▒▒░░▒▒▒▒▓▓        ░░░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓░░░░▒▒▒▒▒▒░░▒▒░░░░▒▒░░░░░░░░░░░░▒▒░░▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████");
        wait(15);
        mes("██████████████▓▓▓▓░░▒▒░░▒▒▒▒▒▒▒▒░░▒▒▓▓▓▓░░        ░░▒▒▓▓▒▒▒▒░░▒▒▒▒▓▓██████▓▓░░░░▒▒▒▒▒▒▒▒░░▒▒░░░░░░░░  ░░░░▓▓  ▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████");
        wait(15);
        mes("██████████████▓▓▒▒░░▒▒▒▒▓▓▓▓▒▒▒▒▒▒▓▓░░      ░░░░▒▒▓▓▒▒░░░░▒▒▒▒▓▓██████████▒▒▒▒░░░░░░░░▓▓░░░░░░░░▒▒░░░░░░░░░░  ▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████");
        wait(15);
        mes("██████████████▓▓▒▒░░▒▒▓▓▒▒░░▒▒▒▒░░        ▒▒▒▒▓▓▒▒▒▒▒▒▒▒░░▒▒████████████████▒▒░░  ░░▒▒░░▓▓░░▒▒▒▒░░░░░░░░  ░░░░▓▓▓▓▓▓████████████▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▒▒░░▒▒▒▒░░░░▒▒        ░░▒▒▓▓▒▒▒▒░░▒▒░░▒▒████████████████████▒▒░░░░░░▓▓▒▒░░▒▒░░▒▒▓▓░░░░░░░░▒▒░░▓▓▓▓▓▓▓▓▓▓██████████████████▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▒▒░░▒▒▒▒░░░░▒▒░░  ░░░░▒▒▒▒▒▒▒▒░░░░▒▒████████████████████████░░░░░░░░██▒▒░░▒▒▒▒▒▒▒▒▒▒░░▒▒░░░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓██████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▒▒▒▒▒▒░░▒▒▒▒  ░░▒▒▓▓▒▒▒▒░░░░░░▒▒▓▓████████████████████████▒▒░░░░░░░░▒▒▓▓░░▒▒▒▒▒▒▒▒▒▒▓▓░░▒▒░░▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▒▒▒▒▒▒▒▒░░░░▒▒▒▒▓▓▒▒░░░░░░▒▒██████████████████████████████░░▒▒░░░░░░░░░░░░░░░░▓▓░░▒▒░░░░▒▒  ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▒▒▒▒▒▒░░▒▒▒▒▓▓▒▒▒▒░░▒▒▒▒██████████████████████████████████░░▒▒░░░░▒▒░░▒▒██  ░░░░░░░░▒▒░░░░  ▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▒▒▒▒░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓████████████████████████████████████▒▒▒▒▒▒░░▒▒░░██░░██▒▒░░░░░░░░░░░░░░██████▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▓▓▒▒▒▒▓▓▒▒░░░░▒▒▓▓██████████████████████████████████████▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒██▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████▓▓▓▓▒▒░░░░░░▓▓██████████████████████████████████████████▓▓▒▒▓▓▒▒▓▓▓▓░░▓▓▒▒▒▒▒▒░░▓▓████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓██████████████████▓▓▓▓▓▓▓▓▓▓████");
        wait(15);
        mes("██████████████████▒▒▒▒▒▒▒▒██████████████████████████████████████████████░░▓▓▓▓▒▒████░░▒▒▓▓██▒▒██████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓████████▓▓");
        wait(15);
        mes("████████████████████████████████████████████████████████████████████████░░▓▓▓▓▒▒████▒▒▒▒▒▒▓▓██████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████████████████████████████████████████████████████████████████████████▒▒▓▓▓▓▒▒████████████████████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓██████");
        wait(15);
        mes("████████████████████████████████████████████████████████████████████████▒▒▓▓▒▒░░██████████████████████████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓██████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████████▒▒▒▒▓▓▒▒░░████████████████████████████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████████▒▒▒▒▒▒▒▒░░████████████████████████████████████████████████████████████████████████████████████████▓▓▓▓▓▓████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████▓▓▒▒▒▒▒▒░░██████████████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████▓▓▒▒▒▒▒▒▒▒██████▒▒░░▒▒██████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████▓▓▒▒▒▒▒▒▓▓████░░▒▒▒▒░░▒▒████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████▒▒▒▒▓▓▒▒░░██▒▒░░░░░░░░░░████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██████████▒▒▒▒▓▓▒▒░░██░░░░░░░░░░░░████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▒▒░░▒▒░░░░▒▒▓▓▒▒░░████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓▒▒░░░░▒▒▓▓▓▓▓▓▒▒████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▒▒    ▓▓▓▓▓▓▒▒▓▓████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓██░░    ░░▓▓▒▒▒▒████████████▓▓▓▓▓▓▓▓████▓▓▓▓▓▓████████████████████████████████████████████████████████▓▓▓▓");
        wait(15);
        mes("████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▒▒▒▒░░        ░░░░▒▒██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓██▓▓");
        wait(15);
        mes("██████████████████████████████████████████████████████████████▓▓▓▓▓▓░░▒▒▒▒░░░░  ░░░░░░  ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████▒▒    ░░░░░░░░  ░░░░░░░░░░  ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████░░░░  ░░░░░░░░  ░░░░░░░░    ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████░░  ░░  ░░      ▓▓▓▓░░      ░░░░██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████░░░░░░  ░░        ░░░░░░░░      ▒▒████████████████████████████████▓▓████▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████");
        wait(15);
        mes("████████████████████████████████▒▒░░▓▓████████████████████████████    ░░░░░░    ▓▓░░        ░░    ░░▓▓██████████████████████████████████████████▓▓████████████████████████████████████");
        wait(15);
        mes("██████▓▓████████████████████████████████████████████████████████▓▓  ░░          ░░▒▒░░░░  ▒▒  ░░░░░░▒▒████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████████████████████████▒▒  ░░░░              ░░▒▒▒▒░░  ░░░░▓▓████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████████████████████████░░    ░░    ░░          ░░░░░░░░░░░░████████████████████████████████████████▓▓██▓▓▓▓▓▓▓▓▓▓████████████████████████████");
        wait(15);
        mes("████████▓▓▓▓████████████████████████████████████████████████████░░░░  ░░░░▒▒▒▒▒▒          ▓▓▓▓▓▓░░████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▒▒▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████░░    ░░▒▒▓▓▓▓▓▓        ░░▓▓▓▓▓▓▒▒████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("░░░░░░░░░░░░░░░░▒▒▒▒▓▓▓▓████████████████████████▓▓████████░░  ░░▒▒▓▓▓▓▓▓▒▒▒▒      ▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████░░██████▓▓▓▓▓▓████████████████████████");
        wait(15);
        mes("░░        ░░░░░░▒▒▒▒▓▓████████▓▓██▓▓▓▓██▒▒        ▒▒▓▓▒▒▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████  ▓▓████████████████████████");
        wait(15);
        mes("▓▓▒▒▒▒░░░░░░░░░░                            ░░▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓    ▒▒▓▓▒▒▓▓▒▒▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████▒▒▓▓██████████████████████████");
        wait(15);
        mes("████████████▓▓▓▓▒▒░░░░░░░░                  ░░▓▓▓▓▒▒░░  ░░░░░░▒▒▓▓              ░░▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████▓▓██████▓▓████████████████████████████████████████████████████████");
        wait(15);
        mes("██▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓▓▓▒▒▒▒░░░░      ▓▓▓▓▓▓░░░░░░░░  ░░▒▒░░        ░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████▓▓████████████████████████████████████████████████████████");
        wait(15);
        mes("████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓████████████████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓  ▒▒▒▒░░      ░░░░░░░░  ░░░░░░░░░░░░▒▒▒▒▓▓▓▓██████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████  ▓▓████████████            ░░░░░░              ░░░░▒▒░░░░░░▒▒▒▒▒▒▓▓██████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▒▒          ░░░░░░░░            ░░▒▒░░░░░░░░░░░░░░░░▒▒████████████████████████████▓▓████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓            ░░░░                  ▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒████▓▓████▓▓████████████▓▓██▒▒▒▒▓▓████████████████████████████");
        wait(15);
        mes("██▓▓████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓    ░░░░  ░░░░░░                    ▒▒▓▓▓▓▓▓██████████████▒▒▒▒▒▒▒▒████████████▒▒░░░░░░░░▓▓██████████████████████████");
        wait(15);
        mes("██▓▓████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓        ░░░░░░                        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░░░▓▓██████████▒▒▒▒░░    ░░▓▓▓▓████████████████████████");
        wait(15);
        mes("████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓░░░░  ░░░░░░                            ▓▓██▓▓▓▓▓▓▓▓▓▓████░░░░░░████████████░░░░░░░░░░░░▓▓▓▓▓▓██████████████████████");
    }

    public static void art10() {
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░░░▒▒▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓  ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▒▒▓▓██████████████████████████▓▓▓▓▒▒▒▒▓▓██████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░    ░░░░▒▒░░▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓████▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▒▒▓▓██████████████▓▓▓▓▒▒▒▒▓▓▓▓██████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░        ░░▒▒░░▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓██▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓██████▓▓▓▓▒▒▒▒▓▓██████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░      ░░░░░░▒▒▓▓▒▒▒▒▓▓▒▒░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓██▓▓████████████████████████████");
        wait(15);
        mes("██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░      ░░▒▒▒▒▒▒▓▓▓▓▒▒░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓░░▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████▓▓▓▓▓▓");
        wait(15);
        mes("████████████▓▓██▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒░░░░░░▒▒▒▒░░▒▒░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▒▒▓▓▓▓▒▒▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓██████████████▓▓▓▓▓▓");
        wait(15);
        mes("██████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓████████▓▓▓▓▓▓");
        wait(15);
        mes("████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓████████████████████▓▓▓▓▓▓▓▓▓▓██");
        wait(15);
        mes("████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓████▓▓▓▓▓▓██▓▓██████████▒▒▒▒▒▒▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░    ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓");
        wait(15);
        mes("██████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓██████████▒▒░░▒▒▒▒░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░        ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓██████");
        wait(15);
        mes("████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓████▓▓████████▓▓▒▒░░▒▒▒▒▒▒░░▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓████████▓▓▓▓▓▓▓▓▓▓▒▒░░        ░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████");
        wait(15);
        mes("████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓██▓▓▓▓██████████▓▓▓▓▒▒▓▓▒▒▓▓▓▓▒▒██▓▓▓▓██████▓▓▓▓████████████████▓▓████████▓▓▓▓▓▓▓▓▓▓▒▒░░░░      ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████▓▓██████████▓▓▓▓▓▓▒▒▓▓▓▓▓▓██████▓▓████▓▓▒▒▒▒▒▒▓▓▒▒██▓▓▓▓████▓▓▓▓▓▓████████████████▓▓██████▓▓████▓▓▓▓▓▓▓▓▒▒▒▒░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓██▓▓██████████████▓▓██████▓▓");
        wait(15);
        mes("██████████████████████████████████████████████████████████▓▓██▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓████████████████████▓▓██████▓▓▓▓▓▓██████▓▓████████▓▓████▓▓██████▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓██▓▓██████████▓▓████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████▓▓██▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████▓▓▓▓██████▓▓▓▓██████████████████▓▓██▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████▒▒▓▓▓▓▒▒████▓▓▓▓██████████████▓▓▓▓▓▓██████▓▓▓▓▓▓██████████████▓▓██▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓████▓▓██████████████████");
        wait(15);
        mes("██▓▓████████████████████████████████████████████████████████▒▒▓▓▓▓▓▓▓▓▒▒▓▓██▓▓▓▓██████████▓▓▓▓▓▓████████▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████");
        wait(15);
        mes("▓▓▓▓▓▓████████████████████████████████████████████████████▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓██▒▒▓▓▓▓██▒▒▒▒██▓▓▓▓▓▓██████████████▓▓▓▓▓▓████████████████████████▓▓▓▓▓▓██▓▓▓▓▓▓████████████████████████████████");
        wait(15);
        mes("██████▓▓██████████████████████████████████████████████████▒▒▓▓▒▒▒▒▒▒▓▓██▓▓▓▓▓▓▓▓▒▒██▓▓▓▓████▓▓██▒▒▓▓▒▒▓▓▓▓▓▓██▓▓████▓▓▓▓██████████████████████████████████▓▓▓▓▓▓██▓▓████████████████████████████████████");
        wait(15);
        mes("██▓▓▓▓▓▓▓▓▓▓▓▓██▓▓██████████████████████████████████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓██▒▒██░░▓▓▓▓▓▓██▓▓▓▓▓▓████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██▓▓██▓▓▓▓▓▓▓▓████████████████████████████████████████████░░▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓████████████▓▓▒▒  ░░░░░░██▓▓▓▓████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓████████▓▓██▓▓▓▓▓▓██████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓████████████████▒▒░░▒▒▒▒░░░░░░░░▓▓▓▓██████████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("██████▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓████████████████▒▒░░░░░░▒▒░░  ░░░░░░░░░░██████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓██████████████▓▓▓▓▓▓██▓▓▓▓▓▓████████████████████████████▒▒▓▓▓▓▓▓▓▓▓▓████████████████▓▓░░  ░░▒▒    ░░░░▒▒▒▒▒▒██████████████████████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▒▒▒▒▓▓██████████▓▓████▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▒▒░░▒▒░░    ░░░░▒▒▒▒▒▒██████▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████████████████████");
        wait(15);
        mes("▓▓▒▒░░▓▓  ░░▓▓██████████████▓▓██▓▓▓▓▓▓██████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▒▒░░▒▒▒▒░░░░░░▒▒▒▒▓▓▓▓██████▓▓▒▒▒▒▒▒▓▓▓▓████████████████████▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████");
        wait(15);
        mes("██████▓▓▒▒▒▒▒▒  ▒▒▒▒▓▓██▓▓██████████▓▓▓▓████████████████▓▓▓▓▓▓▓▓░░▓▓██████████████████▒▒░░▒▒░░░░░░░░▒▒▒▒▒▒▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████");
        wait(15);
        mes("██████████████▓▓▒▒▒▒░░░░▒▒░░░░▒▒▓▓██████▓▓██▓▓██████████▓▓▓▓▓▓▓▓░░▓▓██████████████████▒▒░░░░░░░░░░░░  ░░▒▒▒▒▒▒████▓▓▓▓▓▓▓▓▓▓██▓▓██████▓▓▓▓▓▓▓▓██████▓▓▒▒██▓▓▓▓▓▓████████████████████████████████████████");
        wait(15);
        mes("████████████████████▓▓▓▓▒▒░░░░░░░░░░░░▓▓████████████████▓▓████▓▓░░▓▓▓▓▓▓██████████████▓▓▒▒░░  ░░░░░░░░░░▓▓▓▓▒▒██████▓▓██▓▓██▓▓▓▓██████▓▓▓▓▓▓████████▓▓██▓▓▒▒▓▓▓▓██▓▓▓▓██▓▓██████████████████████████████");
        wait(15);
        mes("████████████████████████████▓▓▒▒░░░░░░░░░░░░▒▒▓▓████▓▓██▓▓██▓▓▓▓░░▒▒▓▓▓▓▓▓██████████████▒▒░░      ░░░░░░░░░░▒▒██████▓▓▓▓██▓▓▓▓▓▓████████████████████▓▓▓▓▓▓██▓▓▓▓▒▒▒▒▓▓██████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████▓▓▒▒░░░░░░░░░░▒▒▓▓██▓▓██▓▓▓▓░░▓▓██▓▓▓▓████████████████▒▒          ░░  ▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓██▓▓▒▒▓▓▓▓▓▓▓▓████████████████████████████████");
        wait(15);
        mes("████████████████████████████████▓▓▓▓▒▒▓▓██▓▓▒▒▒▒░░░░░░░░░░██▓▓▓▓░░▓▓██████████████████████░░    ░░░░░░░░░░░░████████▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓████████████▓▓▓▓██████████████████");
        wait(15);
        mes("██▓▓██████████████████████████▓▓▓▓▒▒▒▒░░██▓▓▓▓████▓▓▒▒░░░░██▓▓▓▓░░▓▓██████████████████████░░      ░░░░░░░░░░▒▒████████████████████████████████████████████▓▓▓▓██▓▓▓▓▓▓██████████▒▒▒▒░░▓▓████████████████");
        wait(15);
        mes("████████████████████████████▓▓██▓▓▓▓▒▒▒▒██████████████████▓▓▒▒▓▓▓▓▒▒░░▒▒▓▓██████████▓▓████░░      ░░░░░░░░░░▒▒██████████████████████████████████████████████████▓▓▓▓▓▓▒▒▒▒▓▓████▒▒▒▒▒▒▒▒████████████████");
        wait(15);
        mes("▓▓██████▓▓██████████████████▓▓████▓▓▓▓▓▓████████████████████▒▒▓▓▓▓▒▒░░░░░░░░░░▓▓██████████▒▒░░    ▓▓░░░░░░░░  ██████████████████████████████████████████████████▓▓▒▒▓▓▒▒▒▒▒▒▒▒██▓▓▓▓▒▒▒▒████████████████");
        wait(15);
        mes("████▓▓████▓▓▓▓▓▓▓▓▓▓████▓▓▒▒▒▒▒▒▒▒▒▒▒▒██████████████████████▓▓▓▓▓▓▒▒████▓▓░░░░░░░░░░▒▒▓▓██▒▒░░░░  ████░░░░░░░░▓▓▓▓██████████████████████████████████████████████▒▒▒▒▒▒▓▓▓▓▓▓▒▒████▓▓▒▒▒▒▓▓██████▓▓▓▓████");
        wait(15);
        mes("██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓████▒▒▓▓▓▓▒▒░░▒▒░░██████████▓▓████████████████▓▓████▓▓████▓▓▒▒░░░░░░░░▒▒░░    ██████▒▒▒▒▒▒░░▒▒▒▒██████████████████████████████████████████░░░░░░▒▒▒▒▓▓▒▒░░██▒▒▒▒░░░░░░░░████████████");
        wait(15);
        mes("██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓██████████████████▓▓████▓▓██████████████████▓▓▒▒░░░░░░░░▒▒▓▓▓▓▓▓▒▒▒▒░░▒▒▒▒████████████████████████████████████████▓▓░░▒▒▓▓▓▓▓▓▓▓▒▒▒▒░░░░░░  ░░▒▒░░████████████");
        wait(15);
        mes("██████▓▓▓▓▓▓▓▓▓▓██▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░░░██████████████████▓▓▓▓████████████████████████▓▓██▒▒░░░░░░░░░░░░░░▒▒▒▒  ▒▒░░▒▒▒▒▒▒▒▒▓▓▓▓██▓▓▓▓▓▓▓▓██████████████▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒░░░░░░░░▒▒░░▒▒░░░░░░░░░░");
        wait(15);
        mes("██████████▓▓▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▒▒▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓██████▓▓██████████████████████████  ▒▒████▓▓▒▒▒▒▒▒░░░░  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░▒▒▓▓▓▓▓▓██");
        wait(15);
        mes("▓▓▓▓▓▓████▓▓██████▓▓▒▒░░██▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓████▓▓▓▓▓▓██████████████████████████████████████▓▓░░░░████████▒▒  ░░░░░░░░▓▓████████████████████████████▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░░░░░▒▒░░░░████████████");
        wait(15);
        mes("▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓████████████▓▓██▓▓██████████████████░░  ████████▒▒░░░░░░▒▒░░▒▒████████████████████████████▓▓▓▓▒▒██▓▓▓▓▒▒▓▓▓▓▓▓██▓▓▓▓▒▒▒▒▒▒▒▒░░░░  ████████████");
        wait(15);
        mes("▓▓▓▓██▓▓██▓▓▓▓▓▓▓▓████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓████▓▓████████████░░  ████████▒▒▒▒▒▒░░░░░░░░████████████████████████████▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓██████▓▓▒▒▒▒░░░░▒▒▒▒▒▒░░▓▓██████████");
        wait(15);
        mes("▒▒██▓▓▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓████▒▒░░████████▒▒▒▒░░░░▒▒▓▓░░████████████████████████████████▓▓▒▒▒▒▓▓██████▒▒░░▓▓▒▒▒▒░░░░░░▒▒▒▒░░▒▒██████████");
        wait(15);
        mes("▓▓▓▓▓▓██▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓██▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓██░░▓▓▓▓████▒▒░░░░░░░░░░██████████████████▓▓██████████████████▒▒▓▓██▓▓▓▓░░░░▓▓▒▒██░░░░░░░░▒▒░░░░██████████");
        wait(15);
        mes("▓▓▒▒▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓████▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓██▓▓▓▓░░██▓▓▒▒▒▒░░░░░░▒▒▒▒████████████████████▓▓██████████████████▓▓▓▓▓▓░░░░▓▓▒▒▒▒██░░░░░░░░▒▒▒▒░░██████████");
        wait(15);
        mes("▓▓▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒░░░░░░▒▒▒▒████████████████████████▓▓██▓▓██████████▓▓▓▓░░░░▓▓▓▓▒▒▒▒▓▓░░░░░░  ░░░░  ██████████");
        wait(15);
        mes("▒▒▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▒▒▓▓██▓▓▓▓▒▒▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▓▓████▓▓▓▓▓▓██████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒░░░░░░░░▒▒██████████████████████████████▓▓██████▓▓▓▓▓▓░░▓▓▒▒▒▒▒▒▒▒░░  ░░  ░░▒▒░░░░██████████");
        wait(15);
        mes("██▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓████▓▓▓▓▓▓██▒▒▓▓██▓▓▓▓▒▒▓▓▓▓░░▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░░░░░░░░░▓▓████▓▓▓▓████████████▓▓██████████▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒        ▒▒▒▒░░▒▒██████████");
        wait(15);
        mes("░░░░▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓██▒▒██▓▓▓▓▒▒▓▓▓▓▒▒▒▒▓▓░░░░▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒░░  ░░▓▓▓▓▓▓▓▓████▓▓▓▓▓▓████▓▓██████████▓▓▓▓▓▓██▓▓▓▓▒▒░░░░▒▒      ░░▒▒░░░░  ████████████");
        wait(15);
        mes("▒▒░░░░▒▒▓▓▒▒▓▓▓▓▒▒▒▒▓▓▒▒▒▒▓▓████▓▓██▓▓▒▒▓▓▒▒▒▒▓▓▒▒▓▓▒▒▒▒▒▒░░▓▓▒▒▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒░░░░  ▒▒██▓▓▓▓▓▓▓▓████████████▓▓▓▓████▓▓▒▒░░▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▒▒    ░░░░░░░░  ▓▓████████▓▓██");
        wait(15);
        mes("▓▓▒▒▓▓▒▒░░▓▓▒▒▓▓▒▒▓▓▒▒██████▓▓▓▓▓▓██▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒░░▒▒░░▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓██▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓██▓▓▓▓████▒▒▒▒▒▒████▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓██▓▓▒▒░░  ░░░░░░░░▓▓████████▓▓████");
        wait(15);
        mes("▓▓▒▒▓▓▒▒▒▒░░▒▒▓▓▓▓▒▒▓▓▓▓██▓▓▓▓▓▓▓▓████▒▒▓▓▓▓▒▒░░▒▒▒▒██▓▓▓▓░░░░▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒░░░░░░  ▒▒▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓██▒▒▒▒▓▓▓▓██▒▒▒▒▒▒▓▓▓▓▒▒▓▓▒▒▓▓▓▓██▒▒░░▒▒  ░░░░▓▓▓▓██▓▓██▓▓▓▓▓▓██");
        wait(15);
        mes("░░▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓██████▓▓▓▓▒▒▒▒▒▒░░▒▒██▒▒▓▓▓▓▒▒░░▒▒▓▓▓▓▓▓▒▒▒▒▓▓▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▒▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▒▒██▓▓░░░░▒▒  ▓▓▓▓██████▓▓████▓▓▓▓▓▓");
        wait(15);
        mes("░░  ░░▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒██▒▒▓▓▓▓▓▓██████▒▒▓▓██▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒░░▒▒▓▓▒▒▒▒▒▒▒▒▓▓░░▒▒▓▓▒▒▒▒▓▓▒▒▓▓▒▒▓▓▒▒▒▒██▒▒░░░░░░░░░░▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒░░▒▒░░▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
    }

    public static void art11() {
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████          ████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                      ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                          ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                          ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓      ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██      ▓▓          ▓▓      ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██      ▓▓          ▓▓      ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██      ▓▓          ▓▓      ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██      ▓▓          ▓▓      ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓  ░░  ░░  ░░  ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ░░  ░░  ░░  ░░  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ░░  ░░  ░░  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░    ░░  ░░    ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░              ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ░░  ░░  ░░  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░▒▒▒▒▒▒░░▒▒░░░░░░▒▒░░░░▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒");
    }

    public static void art12() {
        mes("____________██████████████______________________________________");
        wait(15);
        mes("__________▓▓██████████████▓▓____________________▒▒▒▒▒▒▒▒▒▒▒▒____");
        wait(15);
        mes("__________████░░░░░░░░__████__________________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒__");
        wait(15);
        mes("__________██__░░░░░░░░░░__██______________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("__________██░░░░░░░░░░__░░██______________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("__________░░░░██░░__░░██░░░░______________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("__________░░░░░░░░__░░░░░░░░______________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("____________░░░░░░░░░░░░░░________________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("____________░░░░░░░░░░░░__________________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒");
        wait(15);
        mes("______________░░░░░░░░░░______________________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒__");
        wait(15);
        mes("________________░░░░░░__________________________▒▒▒▒▒▒▒▒▒▒▒▒____");
        wait(15);
        mes("____________▓▓░░░░░░░░░░▓▓░░____________________░░░░░░░░░░______");
        wait(15);
        mes("________░░░░▓▓░░░░░░░░░░▓▓░░░░________________░░░░░░░░░░________");
        wait(15);
        mes("______░░░░░░▓▓░░░░░░░░░░▓▓░░░░░░____________░░░░________________");
        wait(15);
        mes("____░░░░░░░░▓▓▓▓░░░░░░▓▓▓▓__░░░░░░░░____░░░░░░░░________________");
        wait(15);
        mes("____░░░░__░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░__░░░░░░░░░░░░░░░░__________________");
        wait(15);
        mes("____░░░░__▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓______░░░░░░░░______________________");
        wait(15);
        mes("__░░░░░░__▓▓▓▓░░░░▓▓░░░░▓▓▓▓________░░░░________________________");
        wait(15);
        mes("__░░░░░░__▓▓▓▓▓▓░░▓▓▓▓░░▓▓▓▓____________________________________");
        wait(15);
        mes("__░░░░____▓▓▓▓▓▓░░▓▓▓▓░░▒▒▓▓____________________________________");
        wait(15);
        mes("__░░░░____▓▓▓▓▓▓░░▓▓▓▓░░▓▓▓▓____________________________________");
        wait(15);
        mes("__░░░░____▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓____________________________________");
        wait(15);
        mes("__░░░░____▓▓▓▓▓▓░░▓▓▓▓▒▒▓▓▓▓____________________________________");
        wait(15);
        mes("__░░░░____▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("__░░░░____▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("░░░░░░____▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("░░░░░░____▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("░░__░░____▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("░░__░░____▓▓▓▓▓▓______▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("░░________▓▓▓▓▓▓______▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("__░░______▓▓▓▓▓▓______▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("__________▓▓▓▓▓▓______▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("__________▓▓▓▓▓▓______▓▓▓▓▓▓____________________________________");
        wait(15);
        mes("__________░░▒▒▒▒______▒▒▒▒░░____________________________________");
        wait(15);
        mes("__________░░░░__________░░░░____________________________________");
        wait(15);
        mes("__________░░░░__________░░░░____________________________________");
        wait(15);
        mes("__________░░░░__________░░░░____________________________________");
        wait(15);
        mes("__________░░░░__________░░░░____________________________________");
        wait(15);
        mes("__________░░░░__________░░░░____________________________________");
        wait(15);
        mes("__________░░░░__________░░░░____________________________________");
        wait(15);
        mes("__________░░░░__________░░░░____________________________________");
        wait(15);
        mes("________▓▓░░░░__________░░░░▓▓__________________________________");
        wait(15);
        mes("____▓▓▓▓▓▓▓▓▓▓__________▓▓▓▓▓▓▓▓▓▓▓▓____________________________");
        wait(15);
        mes("____▓▓▓▓▓▓▓▓▓▓__________▓▓▓▓▓▓▓▓▓▓▓▓____________________________");
    }

    public static void art13() {
        mes("______________________________________________________________");
        wait(15);
        mes("________▒▒▒▒____▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒____________________________");
        wait(15);
        mes("________▒▒░░▒▒▒▒░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒______________________");
        wait(15);
        mes("____▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒______▓▓▒▒▒▒______");
        wait(15);
        mes("____▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒__▓▓▓▓▒▒▒▒▒▒▓▓▓▓__");
        wait(15);
        mes("______▒▒░░▒▒░░░░░░▒▒░░░░░░▒▒░░░░░░▒▒░░░░▒▒____▓▓▒▒▒▒▒▒▒▒▒▒▓▓__");
        wait(15);
        mes("____▒▒░░░░░░▒▒▒▒░░░░▒▒▒▒░░░░▒▒▒▒░░░░▒▒░░░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓");
        wait(15);
        mes("____▒▒░░░░▒▒░░░░▒▒▒▒░░░░▒▒▒▒░░░░▒▒▒▒░░▒▒░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓");
        wait(15);
        mes("____▒▒░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓");
        wait(15);
        mes("____▒▒░░░░▒▒░░░░░░░░▒▒▒▒▒▒░░░░░░▒▒▒▒▒▒░░▒▒____▓▓▒▒▒▒▒▒▒▒▒▒▓▓__");
        wait(15);
        mes("____▒▒▒▒░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒__▓▓▓▓▒▒▒▒▒▒▒▒▓▓__");
        wait(15);
        mes("__▒▒░░░░▒▒▒▒░░░░░░░░████░░░░░░░░░░████░░▒▒░░▒▒____▓▓▓▓▓▓______");
        wait(15);
        mes("__▒▒░░░░▒▒▒▒░░░░░░░░████░░░░░░░░░░████░░▒▒░░▒▒______▒▒________");
        wait(15);
        mes("__▒▒░░░░▒▒░░░░░░░░░░▒▒▒▒░░░░░░░░░░▒▒▒▒░░▒▒░░▒▒____▒▒░░▒▒______");
        wait(15);
        mes("____▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒______▒▒░░▒▒▒▒____");
        wait(15);
        mes("______▒▒▒▒░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░▒▒________▒▒░░░░░░▒▒__");
        wait(15);
        mes("______▒▒░░░░░░░░░░░░▒▒▒▒▒▒▒▒░░░░░░░░░░░░▒▒______▒▒▒▒░░░░░░▒▒__");
        wait(15);
        mes("______▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒______▒▒░░░░░░░░▒▒__");
        wait(15);
        mes("________▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒__________▒▒▒▒▒▒░░▒▒__");
        wait(15);
        mes("________▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒__________▒▒░░░░░░▒▒__");
        wait(15);
        mes("__________▒▒░░░░░░░░░░░░░░░░░░░░░░░░▒▒____________▒▒░░░░░░▒▒__");
        wait(15);
        mes("____________▒▒▒▒░░░░░░░░░░░░░░░░▒▒▒▒____________▒▒░░░░░░░░▒▒__");
        wait(15);
        mes("________________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒____________▒▒▒▒░░░░░░░░▒▒____");
        wait(15);
        mes("____________▓▓▓▓▓▓▓▓░░░░░░░░░░▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░░░░░░░░░░░▒▒____");
        wait(15);
        mes("________▒▒▒▒▓▓░░░░▓▓░░░░░░░░░░▓▓__░░▓▓░░░░░░░░░░░░░░░░▒▒______");
        wait(15);
        mes("______▒▒░░░░▓▓░░░░░░▓▓░░░░░░▓▓░░░░░░▓▓░░░░░░░░░░░░░░▒▒________");
        wait(15);
        mes("______▒▒░░░░▓▓░░░░░░▓▓░░░░░░▓▓░░░░░░▓▓░░░░░░░░░░▒▒▒▒__________");
        wait(15);
        mes("____▒▒▒▒░░░░▓▓░░░░░░░░▓▓▒▒▒▒░░░░░░░░▓▓░░▒▒▒▒▒▒▒▒______________");
        wait(15);
        mes("____▒▒░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░▓▓▒▒______________________");
        wait(15);
        mes("__▒▒░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("__▒▒░░▒▒░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("____▒▒░░░░░░▒▒▒▒░░░░░░░░░░░░░░░░░░░░▓▓________________________");
        wait(15);
        mes("______▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓________________________");
        wait(15);
        mes("__________▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓________________________");
        wait(15);
        mes("__________▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓________________________");
        wait(15);
        mes("__________▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓______________________");
        wait(15);
        mes("__________▓▓▒▒▒▒▒▒▒▒▒▒▓▓__▓▓▒▒▒▒▒▒▒▒▒▒▓▓______________________");
        wait(15);
        mes("__________▓▓▒▒▒▒▒▒▒▒▒▒▓▓__▓▓▒▒▒▒▒▒▒▒▒▒▓▓______________________");
        wait(15);
        mes("__________▓▓▒▒▒▒▒▒▒▒▒▒▓▓__▓▓▒▒▒▒▒▒▒▒▒▒▓▓______________________");
        wait(15);
        mes("__________▓▓▓▓▓▓▓▓▓▓▓▓▓▓__▓▓▓▓▓▓▓▓▓▓▓▓▓▓______________________");
        wait(15);
        mes("____________▒▒░░░░░░▒▒______▒▒▒▒░░░░▒▒________________________");
        wait(15);
        mes("____________▒▒░░░░░░▒▒______▒▒░░░░░░▒▒________________________");
        wait(15);
        mes("____________▒▒░░░░░░▒▒______▒▒░░░░░░▒▒________________________");
        wait(15);
        mes("____________▓▓▓▓▒▒▒▒▒▒______▓▓▒▒▒▒▒▒▓▓________________________");
        wait(15);
        mes("____________▓▓▒▒▒▒░░░░▒▒____▓▓▒▒▒▒░░░░▒▒______________________");
        wait(15);
        mes("____________▓▓░░░░░░░░▓▓____▓▓░░░░░░░░▓▓______________________");
        wait(15);
        mes("____________▓▓▒▒▒▒▒▒▒▒▓▓____▓▓▒▒▓▓▓▓▒▒▓▓______________________");
    }

    public static void art14() {
        mes("██████████▓▓██████▓▓████████████████▓▓██████▓▓██████████████████████████▓▓▓▓▓▓██████████████████████████████████████████████▒▒████████▓▓▓▓████▓▓░░░░░░░░░░░░░░░░▒▒██████████████████████▒▒▓▓████████████");
        wait(15);
        mes("██████████▓▓██████████████████████████▓▓██████▓▓██████████▓▓██████▓▓████▓▓▓▓▓▓██████████████████████████████████████████████████████████▓▓▓▓██▒▒░░░░░░░░▓▓▓▓▒▒▒▒░░▒▒████▓▓██████████▓▓██▒▒▓▓████████████");
        wait(15);
        mes("██████▓▓▓▓▓▓▓▓██▓▓██████▓▓██████████████████████████████████████████████▓▓████████████████████████████████████████████████▓▓████████████▓▓▓▓▓▓░░░░░░░░░░▒▒░░▒▒▒▒▒▒░░▓▓▓▓▓▓██████▓▓▓▓▒▒▓▓██▓▓▓▓▓▓▒▒▓▓▓▓▓▓");
        wait(15);
        mes("██▓▓████▓▓▓▓▓▓████▓▓████████▓▓██████▓▓▓▓██████████▓▓▓▓██▓▓████████████████████████████████████████████████████████████████████▓▓▓▓▓▓██▓▓▓▓▒▒▒▒░░░░░░░░░░░░░░▒▒▒▒░░░░░░▓▓▓▓██████▓▓▓▓▒▒▓▓██▓▓▓▓▓▓▒▒██▓▓▓▓");
        wait(15);
        mes("██████████████████████▓▓████▓▓██████▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▒▒██▓▓████████████████████████▓▓████▒▒▓▓██████▓▓████████████▓▓████████▓▓████████▒▒▒▒▒▒▒▒░░▒▒░░░░░░░░▒▒▒▒▒▒▒▒░░░░▒▒▓▓██████▒▒▒▒░░░░░░▓▓▓▓▓▓▒▒██████");
        wait(15);
        mes("▓▓██████▓▓██▓▓████████▓▓▓▓██▓▓██████▓▓▓▓▓▓▓▓██▓▓██▒▒▒▒░░▓▓████████████████████████▓▓██████▓▓▓▓██████▓▓██████▓▓████▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓░░░░▒▒░░░░░░▒▒▒▒▓▓▓▓▒▒░░░░▓▓▓▓▓▓▒▒░░░░▒▒░░▒▒▓▓████▓▓██████");
        wait(15);
        mes("████▓▓██████▓▓██████▓▓██████████████▓▓██▓▓██████▒▒▒▒▒▒▓▓██████████▓▓████████████▓▓▓▓██▒▒██▓▓▓▓████████████▓▓▓▓██████▓▓▓▓██████▓▓▓▓▓▓██████▓▓██░░░░░░░░▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▒▒░░░░░░░░▓▓██████████████");
        wait(15);
        mes("██▓▓▓▓██████▓▓██████▓▓▓▓██████▓▓████████████████▓▓▒▒▓▓▓▓▓▓████████████████████▓▓▒▒▓▓▓▓▒▒████████████████████▓▓████▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓████▓▓██▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒░░▒▒██▓▓▓▓▒▒░░░░▒▒▒▒▓▓██▓▓▒▒▓▓████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓████████▓▓██▓▓██████████████████████████▓▓████▓▓████████▓▓████████████▒▒▒▒░░▒▒▒▒██████████████▓▓██▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓████▓▓░░▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓░░▒▒▓▓▓▓▓▓░░░░▒▒▓▓▓▓▓▓██▓▓▒▒██████");
        wait(15);
        mes("▒▒▒▒▒▒▓▓████▓▓██████▓▓██████████▓▓██████▓▓██████████████████████▓▓████████▓▓██▒▒░░░░▒▒████████████████████████████▒▒▒▒░░░░▒▒▒▒██▓▓▓▓██▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▒▒░░░░▒▒▓▓▓▓▓▓████▓▓▓▓▓▓░░▓▓▓▓██████");
        wait(15);
        mes("██▓▓██▓▓██▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████▓▓▓▓██▓▓██▓▓██████████▓▓▓▓██▓▓████████████████████████▓▓██▓▓▒▒▒▒▒▒▒▒▒▒▓▓████▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒░░░░▒▒▓▓▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓██▒▒██████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓██▓▓██████▓▓████████████▓▓▓▓▓▓▓▓▓▓██▓▓████████▓▓▓▓██████████▓▓▓▓██████████████▓▓▓▓▓▓▓▓▒▒░░▓▓▓▓▓▓████▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░░░░░▓▓▓▓▓▓▓▓████▓▓██████");
        wait(15);
        mes("▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓██████▓▓▓▓████████████▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓████████████████▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒▒▒░░▓▓██▓▓▓▓████▒▒██████");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓████████████▓▓▓▓██▓▓▓▓████▓▓▓▓▓▓▓▓██████████████▓▓████▒▒██▓▓████████▒▒▓▓▓▓████▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▒▒▓▓▒▒▒▒▒▒██▓▓▓▓████▓▓▒▒▒▒▓▓");
        wait(15);
        mes("▓▓██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓████████████████████▓▓▓▓██████████▓▓▓▓▓▓████████▒▒██████▓▓████▓▓██████████▓▓▓▓▓▓▓▓████▓▓▓▓██▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓▓▓▓▓████▓▓▓▓██▓▓░░░░▒▒▓▓▓▓████████▓▓████▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████▓▓▓▓▓▓▓▓██▓▓▓▓██▓▓████████▓▓▓▓██████▓▓████████▓▓████████▓▓▓▓▓▓██▒▒▒▒▓▓▓▓██▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓██████▓▓▓▓▒▒▒▒▓▓████████▓▓░░░░▒▒▒▒▓▓████████████▓▓▓▓▓▓▓▓▒▒");
        wait(15);
        mes("██▓▓▓▓▓▓██▓▓▓▓████▓▓██▓▓▓▓██████████████▓▓▓▓▓▓████▓▓██▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓██████▓▓▓▓██▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▒▒██▓▓▓▓██▒▒▒▒▒▒▓▓▓▓▓▓▓▓████████████████▓▓░░▒▒▒▒▓▓▓▓██▓▓████░░░░▒▒▒▒▓▓████████████▓▓▒▒▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓████▓▓▓▓██████████████▓▓▓▓▓▓██▓▓▓▓▓▓▓▓██▓▓▓▓████▓▓▓▓▓▓████████████▒▒▒▒▓▓▓▓██████▓▓▒▒▓▓▒▒▓▓▒▒▓▓██████▓▓▒▒▓▓▓▓▓▓▓▓██████▓▓██████████▓▓▒▒▒▒▒▒▓▓██████████░░░░▒▒▒▒▓▓██████████▓▓▓▓▒▒▓▓▒▒▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓████▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓██▓▓▓▓████▓▓▓▓██████▓▓▓▓██████▒▒▓▓▓▓▓▓████▓▓▓▓▒▒▓▓▒▒▒▒██████▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓██████████▒▒░░▒▒▒▒▓▓██████▓▓░░▒▒▒▒▒▒▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓██▓▓▓▓▓▓▓▓██████████████▓▓██████▓▓██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓████▓▓▓▓██████▓▓▓▓▓▓████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓██▓▓▓▓████▓▓▒▒▒▒▓▓▓▓▓▓████▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓");
        wait(15);
        mes("▓▓██▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓██████▓▓▓▓▓▓▓▓██▓▓██▓▓▓▓▓▓▓▓██████▓▓▓▓████▓▓▓▓▓▓▓▓████▓▓▒▒▒▒██▓▓▒▒▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓██▓▓▒▒▓▓▓▓▓▓████▓▓██████▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("████▓▓████▓▓▓▓████████████▓▓▓▓████████▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓████████▓▓██▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒██▓▓▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒████▓▓▒▒▓▓▓▓████████████▓▓▒▒▒▒▓▓▓▓▒▒▓▓▓▓██▒▒▒▒░░▒▒▒▒▓▓▓▓▓▓");
        wait(15);
        mes("████▓▓████████▓▓██▓▓████▓▓▓▓▓▓████▓▓██▓▓██████▓▓████▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓░░▒▒▓▓▓▓▓▓▒▒▓▓████▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒████▒▒▓▓██████████████░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░░░▒▒▓▓██▓▓▓▓");
        wait(15);
        mes("██████████▓▓██▓▓██▓▓▓▓▓▓████▓▓██▓▓▓▓▓▓██▓▓▒▒████████████▓▓▓▓████▓▓██▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓████████▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒████████████████████▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░░░▒▒▒▒▓▓██▓▓▓▓");
        wait(15);
        mes("██▓▓▒▒▓▓██▒▒▓▓▓▓██▓▓▓▓▓▓▓▓██▓▓████▓▓▓▓▓▓██▓▓▓▓▒▒████████▓▓▓▓████▓▓██▓▓████████▓▓▓▓██▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒▓▓████████████▓▓▒▒▒▒▒▒▒▒▓▓▓▓████████████▒▒▒▒▓▓▓▓▓▓▓▓");
        wait(15);
        mes("██▓▓▒▒▓▓██▓▓██▓▓▓▓▓▓████▓▓▓▓██▓▓▒▒▓▓▓▓████▓▓▒▒▓▓▒▒▓▓██▓▓▓▓████▓▓▒▒▓▓██████████▓▓▓▓██▓▓▒▒▓▓▒▒▒▒██▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓████▓▓██████▓▓▓▓▓▓▓▓▓▓▒▒  ▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓████████▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▒▒▓▓▓▓████████████████████▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓██▓▓██████▓▓▓▓██████████▓▓▓▓████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▒▒▓▓██▓▓░░▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓  ▒▒▒▒▒▒▒▒▒▒▓▓▓▓██░░▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓██▓▓▓▓██████████████▓▓▒▒▒▒▓▓▓▓▓▓████▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓██▒▒▒▒▓▓░░▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▒▒▓▓▓▓▓▓▒▒░░▒▒░░▒▒░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒██▒▒▓▓▓▓▒▒▓▓▒▒  ░░");
        wait(15);
        mes("▓▓▓▓▓▓▓▓██████████████████████▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒██▓▓▒▒▓▓▓▓██▓▓████████████▒▒▒▒▓▓▒▒▓▓▓▓░░▓▓▓▓▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▒▒░░░░▒▒▒▒░░░░░░░░▒▒░░  ░░▒▒░░▒▒▓▓▓▓▓▓▒▒▒▒▓▓██▒▒▓▓▓▓▒▒▒▒▒▒▓▓▒▒░░");
        wait(15);
        mes("▓▓██▓▓████████████████████████▓▓██▒▒▒▒▓▓████▓▓▒▒▓▓▓▓▓▓▒▒████▓▓▒▒▓▓████████▓▓░░▒▒▓▓████▓▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒▓▓▓▓░░▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓████▒▒░░▒▒▒▒▒▒▒▒▒▒░░░░░░░░  ░░  ░░▒▒██▓▓▓▓▒▒▒▒▒▒██████▓▓▓▓████▒▒▒▒    ░░");
        wait(15);
        mes("████████████████████████████▓▓▓▓▓▓▓▓▒▒▒▒▒▒██▓▓████▓▓▒▒▒▒▓▓▓▓▓▓▒▒▓▓██████▓▓▓▓▒▒▓▓████▓▓▓▓▒▒▓▓▓▓▒▒▓▓▒▒▒▒▓▓▓▓▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓░░▒▒░░▓▓░░▓▓██▓▓▒▒▒▒░░▓▓████▓▓██▒▒░░▓▓▓▓    ░░▒▒");
        wait(15);
        mes("██▓▓▓▓████████████████████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓▓▒▒████▓▓▒▒▒▒▓▓██████▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓    ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓░░░░▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓");
        wait(15);
        mes("████▒▒▓▓████████████████████▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓████▒▒▒▒████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓  ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓████▓▓▒▒▓▓████▓▓▓▓▓▓");
        wait(15);
        mes("████▒▒▒▒██████████████████▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓██▓▓████▓▓▓▓██▓▓▒▒██████▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒░░▓▓▓▓▓▓██▓▓▒▒▓▓▓▓██████▒▒▒▒▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓  ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░░░▓▓▓▓▓▓██▓▓▓▓░░");
        wait(15);
        mes("██▒▒░░▒▒▓▓██████████████████▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒████████▓▓▓▓████████▓▓▓▓██▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▒▒▒▒░░░░▓▓██▓▓██▓▓▓▓████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓    ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒");
        wait(15);
        mes("██▒▒░░▒▒▓▓██████████████████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒████████▓▓▓▓▓▓██▓▓████████▓▓▓▓▒▒▒▒▒▒▒▒▓▓██▓▓▓▓████████▓▓▓▓████▓▓▓▓▒▒▒▒░░▓▓██▓▓██▓▓▓▓████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░  ░░▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓░░");
        wait(15);
        mes("▓▓▒▒▓▓░░▒▒████████████████████▓▓▓▓▓▓▓▓▓▓▒▒▒▒████████▓▓▓▓▓▓██░░████▓▓▓▓██▒▒▒▒▒▒▓▓▓▓▓▓▓▓████████▓▓████▓▓████████▓▓▒▒▓▓████▒▒██▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓██▓▓▓▓▓▓▒▒░░░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░");
        wait(15);
        mes("░░▒▒▒▒▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒██▓▓▓▓▒▒██▒▒▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓██████████████▓▓▒▒▒▒▓▓██▒▒▓▓▓▓▒▒░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒██▓▓▓▓░░    ▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓░░");
        wait(15);
        mes("░░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒░░▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██▓▓▓▓▒▒████▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒████████▓▓██████████████▓▓▒▒▒▒  ░░▒▒██▒▒▓▓▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒");
        wait(15);
        mes("▒▒▒▒░░▒▒░░▒▒▒▒▒▒░░▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒██▓▓████▓▓▓▓██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓████████████████░░  ░░        ▒▒  ░░░░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓░░  ▒▒▓▓▓▓▓▓▓▓▒▒░░░░");
        wait(15);
        mes("▒▒▒▒░░░░▒▒▒▒▒▒▒▒░░░░▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░░░▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓████▓▓▓▓██▒▒▒▒████▓▓██████████          ░░    ░░  ▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓██▓▓░░  ▒▒░░    ░░▓▓▒▒▒▒▒▒▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▒▒▒▒▒▒░░░░▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▒▒▒▒▓▓██▓▓██████████          ░░░░  ░░░░▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██    ░░░░▓▓▓▓░░▓▓▓▓▓▓▒▒▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▒▒▒▒░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▒▒▓▓▓▓██▓▓▒▒▒▒▓▓▓▓▓▓░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▒▒▒▒▓▓▓▓████▓▓░░░░▒▒░░      ▒▒██▓▓▓▓░░██▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒  ░░░░████████▓▓▒▒▓▓▒▒▒▒▓▓▒▒");
        wait(15);
        mes("██▒▒▒▒▒▒░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██▒▒▒▒▓▓▓▓▓▓▓▓▓▓  ▓▓▓▓▓▓▓▓░░▒▒██████████████▓▓▒▒▓▓▓▓▓▓▓▓██▒▒▓▓▒▒▒▒░░      ▒▒░░▒▒██▓▓██▒▒░░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒██▒▒▒▒░░░░▓▓▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▒▒");
        wait(15);
        mes("▓▓▒▒▒▒▒▒░░░░▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒██████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒▒▒░░    ░░▒▒░░▓▓▓▓██████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒");
        wait(15);
        mes("▒▒▓▓▒▒░░░░▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒██▓▓░░░░▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓░░▒▒▓▓██████▓▓▒▒▒▒▒▒▒▒▒▒▒▒██▓▓▓▓▒▒▒▒░░░░▒▒░░░░░░░░▒▒▒▒▓▓▓▓████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░▓▓▓▓▓▓▓▓▒▒░░▒▒▓▓▓▓▓▓██████▓▓");
        wait(15);
        mes("▒▒▒▒▒▒░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▒▒▓▓▓▓▓▓▓▓██▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓░░░░▒▒▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░▓▓▓▓▒▒▓▓▓▓▓▓░░▓▓██▓▓▓▓▓▓▓▓████▒▒");
        wait(15);
        mes("▒▒▒▒░░▒▒▒▒▒▒▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▒▒██░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓░░░░▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░░░  ▓▓▓▓▒▒▓▓██▓▓░░░░▓▓▓▓▓▓▒▒▒▒▒▒██░░");
        wait(15);
        mes("▒▒░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓░░░░░░░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓██░░░░░░▒▒▒▒▒▒▒▒▓▓▓▓  ░░▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░░░  ▓▓▓▓▒▒▓▓██▓▓░░░░▓▓▓▓▒▒▒▒▒▒▓▓▓▓");
        wait(15);
        mes("▒▒░░▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓░░░░░░░░▒▒░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████░░░░░░▒▒▒▒▒▒▒▒▓▓▒▒  ░░▒▒▓▓▒▒▓▓▓▓▒▒░░▒▒░░  ▒▒▒▒▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓██▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓");
        wait(15);
        mes("░░▒▒▒▒▒▒▒▒▓▓▓▓██▓▓▒▒░░▓▓░░▒▒▓▓▒▒▓▓▓▓▒▒░░░░▒▒░░▒▒▒▒▓▓██████▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓██▓▓████▓▓██▓▓░░░░▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓▓▓▓▓");
        wait(15);
        mes("░░▒▒▒▒▓▓▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒░░░░▒▒▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓▓▓▒▒░░▒▒▒▒▓▓▒▒▒▒▓▓░░░░▒▒▒▒▓▓▓▓▓▓▒▒░░▒▒    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓░░░░░░░░▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▒▒▓▓▓▓▓▓████▓▓▓▓▓▓░░▒▒▒▒░░▒▒▓▓████▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓██████████▓▓▓▓░░▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒░░░░░░░░▒▒▒▒▒▒▒▒  ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▒▒▓▓░░  ░░▒▒▒▒▒▒░░░░  ▒▒░░░░░░▒▒▓▓▒▒▓▓▓▓▒▒");
        wait(15);
        mes("▒▒▒▒▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▒▒░░░░░░▒▒▓▓████▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓░░▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░░░▒▒▓▓██▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▒▒▓▓▒▒░░░░▒▒░░        ████▓▓▒▒░░▒▒  ▒▒▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░░░▓▓██████████▓▓▒▒▓▓▒▒▒▒▓▓████████████▓▓██▓▓▓▓▒▒░░░░░░▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▒▒▓▓▒▒▒▒░░▒▒▒▒      ▒▒██▒▒▒▒▓▓██▒▒  ░░▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓██████▓▓▓▓▒▒▒▒▒▒▓▓▒▒▓▓████████████████▓▓░░▒▒▒▒░░  ▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒██▒▒▒▒░░▓▓▓▓    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▒▒▓▓▓▓▒▒░░▒▒▓▓░░      ░░▒▒░░▒▒░░▒▒▒▒░░░░▓▓▓▓");
    }

    public static void art15() {
        mes("▓▓████████▒▒  ▒▒████████████████████▓▓▒▒  ░░▓▓██░░▒▒██▓▓  ▓▓████▒▒▒▒▒▒▓▓░░░░▒▒████▓▓██████████████▓▓▒▒████████████████████");
        wait(15);
        mes("▓▓██████████░░░░░░▒▒████████████████████▓▓    ▒▒▓▓  ▒▒▓▓▒▒  ▒▒▒▒▒▒████▓▓▒▒████▓▓██▒▒▒▒░░░░▒▒██████░░████████████████████");
        wait(15);
        mes("▓▓░░  ▒▒██████████░░░░░░▓▓████████████████████▓▓    ░░██░░      ░░▓▓██████░░██████████████████░░▒▒████▒▒██████████████████");
        wait(15);
        mes("██████▓▓  ▒▒██████████░░      ▓▓██████████████████        ▒▒░░▒▒    ░░▓▓████████████████████████▒▒▒▒██░░██████████████████");
        wait(15);
        mes("██████████    ░░██████████▒▒    ████████████▓▓▒▒░░▒▒  ▒▒▒▒░░  ▒▒▒▒████    ▒▒░░████████████████████▒▒▓▓▓▓▒▒████████████████");
        wait(15);
        mes("▒▒██████▓▓░░    ████████████░░  ░░░░░░▒▒░░░░░░▒▒░░  ▒▒▓▓████    ░░████▓▓    ▒▒████████████████████░░██  ████████████████");
        wait(15);
        mes("░░░░▒▒▒▒░░░░  ▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒░░  ░░    ░░    ▒▒████████▓▓      ██████    ▒▒████████████████████  ░░▓▓██████████████");
        wait(15);
        mes("░░░░▒▒░░      ░░    ░░▒▒▒▒░░░░▒▒▒▒▒▒▒▒      ░░██████████████████▒▒      ░░▓▓            ░░    ░░██████  ░░██████████████");
        wait(15);
        mes("▓▓▒▒░░  ░░░░    ░░░░      ░░░░▓▓▓▓██████  ▒▒▒▒    ▒▒████████████████░░  ░░▒▒░░  ░░░░░░░░░░░░░░░░░░  ▓▓████  ▒▒████████████");
        wait(15);
        mes("▓▓██████    ▓▓██░░  ░░  ▒▒  ░░▓▓██████  ▓▓░░██████  ░░  ▒▒██████▒▒    ████▒▒    ░░▒▒▒▒░░░░░░░░░░░░░░░░░░██░░  ████████████");
        wait(15);
        mes("▒▒░░████▒▒░░    ▒▒▒▒██░░        ▒▒██▒▒▓▓██░░████████  ██▓▓░░░░▓▓░░██▓▓▒▒░░░░░░▒▒░░░░░░    ░░░░  ░░░░░░░░░░    ░░██████████");
        wait(15);
        mes("░░██░░░░██████▒▒▓▓░░██████          ▒▒  ░░▒▒██████████░░▓▓██▒▒  ░░██▓▓  ░░░░░░▒▒▒▒░░░░▒▒▒▒░░░░  ░░░░░░░░░░      ▓▓████████");
        wait(15);
        mes("██▒▒░░██░░░░████░░▒▒██████▓▓  ░░            ▒▒▓▓████████░░░░░░▓▓▒▒░░    ░░░░░░▒▒▓▓▒▒▒▒░░░░░░  ▒▒▒▒▒▒▒▒░░░░  ░░▒▒  ████████");
        wait(15);
        mes("██████░░░░▓▓  ▓▓██  ░░██████  ▒▒▒▒        ▓▓▓▓▓▓▒▒░░  ░░░░▒▒▒▒██▓▓░░  ░░░░░░░░░░░░  ░░▒▒▓▓▓▓▒▒▒▒░░░░▒▒▓▓▓▓  ░░  ░░░░██████");
        wait(15);
        mes("░░░░▒▒▓▓▒▒        ▒▒      ░░░░░░▒▒  ▓▓        ░░██████░░░░██▓▓░░░░░░░░░░▒▒▒▒▒▒▒▒  ░░░░░░▒▒▒▒░░░░░░░░░░░░  ░░▒▒░░  ░░▓▓████");
        wait(15);
        mes("████████████▒▒  ░░    ░░▓▓▓▓░░  ██░░░░▓▓  ░░░░    ██████▒▒  ▒▒░░░░░░░░▒▒▒▒▓▓▒▒  ▒▒▓▓▓▓▓▓░░    ░░░░  ██▒▒▒▒▒▒░░░░▒▒    ▓▓██");
        wait(15);
        mes("████████████████████▒▒      ▒▒  ▒▒▓▓██▒▒  ░░░░▓▓  ░░██████  ▓▓  ░░▒▒▒▒▒▒▒▒▓▓░░▓▓▓▓▒▒▒▒▒▒▓▓▒▒▓▓▓▓░░  ░░  ░░░░░░▒▒░░▒▒  ░░██");
        wait(15);
        mes("████████████████████████        ░░▓▓████▒▒░░  ░░▒▒    ▓▓██▒▒░░░░▒▒░░░░▒▒▒▒░░▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒  ▒▒▒▒░░▒▒░░  ░░  ░░░░  ██");
        wait(15);
        mes("██████████████████████████  ░░        ████░░░░  ░░██░░░░░░▓▓  ▒▒▒▒▒▒▒▒░░░░▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓░░░░▓▓▓▓▒▒██▓▓▓▓▓▓    ▒▒▒▒  ██");
        wait(15);
        mes("████████████████████████████          ░░████▒▒  ░░      ░░      ▒▒▒▒▒▒▒▒    ▓▓▓▓▓▓▓▓▒▒▓▓▒▒  ▒▒▓▓▒▒▒▒▓▓▒▒▒▒▓▓▓▓░░░░  ░░  ░░");
        wait(15);
        mes("██████████████████████████████░░        ░░  ░░▒▒██░░░░    ░░░░  ░░▒▒▓▓▒▒░░██░░  ░░▒▒▓▓▓▓░░▒▒██▓▓▒▒▒▒██▒▒▓▓▒▒░░▒▒░░▒▒  ░░");
        wait(15);
        mes("████████████████████████████████  ▒▒      ░░        ▒▒  ░░      ▒▒  ▒▒░░▒▒██▓▓▓▓▒▒░░      ▓▓▒▒██▓▓▒▒░░▒▒  ▒▒▓▓▓▓▓▓▒▒░░");
        wait(15);
        mes("████████████████████████████████    ░░▒▒▓▓                      ▓▓▓▓▒▒  ▓▓██▓▓▓▓▓▓▓▓▓▓▒▒░░    ░░░░    ░░▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░");
        wait(15);
        mes("████████████████████████████████████    ░░▒▒                ░░░░▓▓▓▓▓▓  ░░  ░░▒▒▓▓▒▒  ░░▓▓██▓▓▒▒▓▓  ░░░░  ░░▒▒▓▓▒▒░░  ░░");
        wait(15);
        mes("████████████████████████████████████▓▓  ██▒▒░░██░░    ▓▓░░  ░░▒▒▓▓▓▓▓▓  ▓▓██▒▒    ▒▒████████▓▓▓▓▓▓▓▓░░▒▒▒▒░░░░░░░░░░▒▒▒▒░░");
        wait(15);
        mes("██████████████████████████████████████░░░░  ████▓▓            ▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓    ▓▓▓▓▓▓██▓▓▓▓▓▓▓▓  ▒▒▒▒▓▓▒▒▒▒▓▓▒▒▒▒▒▒░░");
        wait(15);
        mes("████████████████████████████████████████    ▓▓██  ██  ░░      ▒▒▓▓▓▓▒▒▒▒▓▓▓▓  ▒▒▒▒░░▓▓████▓▓██▒▒  ▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒░░");
        wait(15);
        mes("████████████████████████████████████████          ░░      ░░░░  ▒▒▒▒░░▓▓▒▒░░▓▓▒▒▓▓  ▒▒▓▓▓▓▓▓░░░░▒▒▒▒▓▓▒▒▒▒▓▓▒▒▓▓▓▓▒▒▒▒  ░░");
        wait(15);
        mes("████████████████████████████████████████▓▓  ██  ▓▓  ▒▒  ░░░░▒▒░░    ░░░░░░░░▓▓▒▒▓▓▓▓░░    ░░▓▓██▒▒▒▒▓▓▒▒▒▒▓▓▒▒▓▓▓▓▒▒▒▒░░▓▓");
        wait(15);
        mes("██████████████████████████████████████████        ░░▓▓░░░░░░▒▒▒▒    ░░░░  ▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▒▒▓▓░░██");
        wait(15);
        mes("██████████████████████████████████████████▒▒      ██▒▒░░░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓▒▒  ████");
        wait(15);
        mes("████████████████████████████████████████████░░▒▒▒▒▒▒██░░░░░░▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▓▓▒▒░░██████");
        wait(15);
        mes("██████████████████████████████████████████████████  ██    ░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒▓▓▒▒████████");
        wait(15);
        mes("██████████████████████████████████████████████████  ░░░░░░    ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▒▒▒▒▓▓▒▒▒▒▒▒██████████");
        wait(15);
        mes("████████████████████████████████████████████████████▒▒████▓▓░░  ▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▒▒▒▒▓▓▒▒▒▒████████████");
        wait(15);
        mes("████████████████████████████████████████████████████████████▓▓░░██  ░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▒▒██████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████    ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████▒▒  ░░▓▓▒▒░░▒▒░░▒▒▒▒▒▒░░░░▒▒▒▒░░▒▒▒▒▓▓██████████████████");
        wait(15);
        mes("████████████████████████████████████████████████████████████████████████▒▒░░░░▒▒░░░░░░▒▒▒▒░░░░░░▒▒▓▓██████████████████████");
    }

    public static void art16() {
        mes("__________________________________________________________░░▒▒▒▒▓▓▓▓▓▓▒▒░░░░______________________________________________________");
        wait(15);
        mes("________________________________________________░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░______________________________________________");
        wait(15);
        mes("__________________________________________░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░______________________________________");
        wait(15);
        mes("______________________________________▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░__________________________________");
        wait(15);
        mes("__________________________________▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░______________________________");
        wait(15);
        mes("______________________________▒▒▓▓▓▓▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒____________________________");
        wait(15);
        mes("__________________________░░▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░________________________");
        wait(15);
        mes("________________________▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓░░______________________");
        wait(15);
        mes("______________________▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒____________________");
        wait(15);
        mes("____________________▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒__________________");
        wait(15);
        mes("__________________▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒________________");
        wait(15);
        mes("________________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒______________");
        wait(15);
        mes("______________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒____________");
        wait(15);
        mes("____________░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓░░__________");
        wait(15);
        mes("____________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓__________");
        wait(15);
        mes("__________▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░________");
        wait(15);
        mes("__________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒________");
        wait(15);
        mes("________▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░______");
        wait(15);
        mes("________▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒______");
        wait(15);
        mes("______░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒░░▒▒▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒______");
        wait(15);
        mes("______▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░▒▒▓▓▓▓__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒____");
        wait(15);
        mes("____░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒░░▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒____");
        wait(15);
        mes("____▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░__");
        wait(15);
        mes("____▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒██▓▓▓▓▒▒__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒__");
        wait(15);
        mes("____▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░██▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██▓▓▓▓░░░░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒__");
        wait(15);
        mes("__░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓██▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██▓▓██▓▓░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒__");
        wait(15);
        mes("__░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░██████▒▒▓▓▓▓▓▓▓▓▒▒██▓▓██▓▓▒▒░░▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒__");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░██████████████████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓██████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒");
        wait(15);
        mes("__▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓██████████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒");
        wait(15);
        mes("__▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("__▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("__░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        wait(15);
        mes("____▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░");
        wait(15);
        mes("____▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒__");
        wait(15);
        mes("____▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒__");
        wait(15);
        mes("____▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓░░▒▒▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒__");
        wait(15);
        mes("____░░▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▓▓░░▒▒░░▒▒▒▒▒▒▒▒▒▒____");
        wait(15);
        mes("______▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▓▓░░░░▒▒░░▓▓▒▒▒▒▒▒▒▒▒▒▓▓____");
        wait(15);
        mes("______▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒██▒▒██▒▒░░▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒░░____");
        wait(15);
        mes("________▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒██░░░░▒▒▒▒██░░██░░▓▓▓▓▓▓▒▒▒▒▒▒▓▓______");
        wait(15);
        mes("________▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▓▓▓▓▓▓▒▒██▒▒▓▓▓▓▒▒██░░██▒▒██▒▒▒▒▓▓▓▓▒▒▓▓______");
        wait(15);
        mes("__________▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒████▓▓▓▓▓▓▓▓██▒▒██▒▒▓▓▓▓▓▓░░██▒▒▓▓▓▓▒▒██▒▒██▓▓▒▒▓▓▓▓▒▒▓▓▓▓░░______");
        wait(15);
        mes("__________▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒██▒▒▓▓▓▓▓▓░░██▒▒▓▓▓▓▒▒██▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒________");
        wait(15);
        mes("____________▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▒▒██▒▒▓▓▓▓▓▓░░██▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓__________");
        wait(15);
        mes("____________▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▒▒▒▒▒▒▓▓▓▓▒▒██░░▒▒▓▓▒▒░░▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░__________");
        wait(15);
        mes("______________▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▒▒▒▒▒▒▓▓▓▓▒▒██▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒____________");
        wait(15);
        mes("________________▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓______________");
        wait(15);
        mes("________________░░▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓________________");
        wait(15);
        mes("__________________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓__________________");
        wait(15);
        mes("____________________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░__________________");
        wait(15);
        mes("______________________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓______________________");
        wait(15);
        mes("________________________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒________________________");
        wait(15);
        mes("____________________________▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░__________________________");
        wait(15);
        mes("________________________________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░______________________________");
        wait(15);
        mes("____________________________________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒__________________________________");
        wait(15);
        mes("________________________________________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░______________________________________");
        wait(15);
        mes("______________________________________________░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░____________________________________________");
    }

    public static void art17() {
        wait(15);
        mes("████████▓▓▓▓██████████████████████████████████████████████████▓▓▓▓██░░▒▒▓▓██████████████▒▒▓▓▒▒░░██████████████████████████████████████████████▓▓████████");
        wait(15);
        mes("████████████████████████████████████████████████████████████████████▓▓▓▓▓▓██████▓▓██████▒▒░░▒▒▒▒██████████▓▓██████████████████████████████████▓▓████████");
        wait(15);
        mes("████████████████░░████████████████████████████████████████████████████▓▓░░████▓▓▓▓▓▓████▒▒▒▒▒▒▒▒██▓▓██████████████████████████████████████████████▓▓████");
        wait(15);
        mes("██████████████████████▓▓██████████████████████████████████████████████▒▒▒▒▓▓▓▓▒▒░░▒▒████▓▓▒▒▒▒▓▓████████████████████████████████████████████████▓▓██████");
        wait(15);
        mes("██████████████████████▒▒████████████████████████████████████████████▓▓▓▓▓▓▒▒▓▓  ▒▒▓▓▓▓██▓▓██████████████████████████████████████████████████████▓▓▓▓████");
        wait(15);
        mes("██████████████████████████████▓▓████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████▓▓██████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████████▓▓▓▓██████████████████████████████████████▓▓▓▓██████▓▓▓▓██████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████████████▓▓▓▓██████████████████████████████████████████▓▓▓▓████████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████░░████████████████████████████░░██████████████████████████▓▓██████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████████░░██████████████████████░░██████████████████████████▒▒▓▓████████████████████████████████████████████████");
        wait(15);
        mes("▓▓████████████████████████████████████████████████████████▓▓▓▓▓▓████████░░▓▓██████████████████████████▓▓████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████████████████████████████████▓▓██░░░░████████▓▓▓▓████████████████▓▓██████████████████████████████████████████████");
        wait(15);
        mes("░░▓▓▓▓██████████████████████████████████████████████████████████████████░░░░▒▒██████▓▓▒▒██████▓▓▓▓██████▓▓▓▓████████████████████████████████████████████");
        wait(15);
        mes("▓▓▒▒▒▒░░██████████████████████████████████████████████████████████████████▒▒▓▓██████▓▓▓▓████████████████▓▓▓▓████████████████████████████████████████████");
        wait(15);
        mes("██████▓▓██▓▓▓▓▓▓████████████████████████████████████████████████████████████▓▓▓▓▓▓████▓▓██████████████████▓▓████████████████████████████████████████████");
        wait(15);
        mes("████████████████▓▓▓▓▓▓██████████████████████████████████████████████████████████  ▓▓▒▒▓▓▓▓██████████████████████████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████████▓▓████████████████████████▓▓▓▓██████████░░▓▓▓▓▓▓▓▓████████████████▓▓▓▓██████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████▓▓░░██████████████████████████████▓▓▓▓▓▓▒▒▒▒▓▓▓▓██▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓██████████████████████████████████████████");
        wait(15);
        mes("████████████████████████████████████▓▓░░▒▒▒▒████████████▓▓██▓▓▓▓██████████████▓▓▒▒▒▒▒▒▒▒▒▒████████████████▓▓████████████████████████████████████▓▓▓▓▒▒██");
        wait(15);
        mes("████████████████████████████████▓▓██████████▒▒░░░░██████████▓▓▓▓██████████▒▒██▒▒░░░░░░▓▓▓▓██████████████▒▒██▓▓████████▓▓▒▒▓▓████████████████████████████");
        wait(15);
        mes("██████████████████████████████████████████████████████████████▓▓░░▒▒██████████▒▒░░░░░░▓▓████████████▓▓░░▓▓▓▓▓▓▓▓████████▒▒▓▓██████████████▓▓▒▒▒▒░░▒▒██▒▒");
        wait(15);
        mes("████████████████████████████████████████████████████▓▓████░░▓▓██░░░░██████░░  ▓▓░░░░░░▒▒▒▒▒▒██████████▒▒▓▓▓▓▓▓░░████▒▒▓▓▓▓▓▓██████░░▒▒▓▓▓▓██████████████");
        wait(15);
        mes("▓▓▓▓██████████████████████████████████████████████████▓▓    ░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓░░▒▒░░░░░░██████████▓▓▒▒▓▓████▓▓████████▓▓▓▓████████████████▒▒▓▓████████");
        wait(15);
        mes("████▓▓████████████░░▓▓████████████████████████████████░░  ░░  ░░░░▒▒▓▓████████░░░░░░░░░░░░████████████▒▒▓▓▓▓██▓▓████████▓▓▓▓▒▒██████████████▓▓▓▓▓▓██████");
        wait(15);
        mes("▓▓██▓▓████▓▓▓▓██▓▓██████████▓▓████████████████████████▓▓░░░░▓▓▓▓▓▓▓▓██████████░░░░░░░░░░░░░░██████████▓▓██▓▓▓▓▓▓██████▓▓▓▓░░▓▓▓▓████████████████▓▓██████");
        wait(15);
        mes("██▓▓██▓▓████▓▓▓▓██████▓▓██████████▓▓██████▓▓██████░░▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓██████████░░    ░░░░░░░░▓▓████████████████▓▓████▒▒░░▒▒░░▒▒▓▓▒▒██████▓▓▓▓░░░░░░▒▒▒▒▒▒");
        wait(15);
        mes("▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓██▓▓██████▓▓▓▓██████░░▒▒▓▓▓▓░░▒▒████████████████  ░░░░▒▒░░░░░░░░▓▓▓▓▓▓██████▓▓████▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓░░░░░░░░▓▓▓▓▓▓");
        wait(15);
        mes("██▒▒▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓████▓▓▓▓▓▓██▓▓██▓▓▒▒▓▓▓▓▓▓░░▒▒▒▒▒▒▒▒██████████  ░░░░▒▒▒▒▒▒░░  ▒▒████████████▓▓▓▓▓▓▓▓▒▒▒▒░░████▓▓▓▓████▓▓██▓▓░░▓▓▓▓████▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░▒▒▒▒▒▒████████████░░░░░░▒▒▓▓▒▒▒▒▒▒▒▒██████████▓▓▓▓▒▒▒▒▓▓▒▒░░▓▓████▓▓▓▓▓▓▓▓▓▓██▓▓▒▒██████████");
        wait(15);
        mes("██▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒░░░░░░▒▒░░▓▓▓▓████████░░░░░░▒▒▓▓▒▒▒▒▒▒░░▓▓████▓▓▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▓▓████▓▓▓▓▓▓██▓▓██▓▓██████▓▓▓▓██");
        wait(15);
        mes("▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓▓▓░░░░▒▒░░░░▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██▒▒░░░░░░░░░░▓▓████▓▓▓▓▓▓▒▒░░░░▓▓▓▓▒▒▒▒▒▒▒▒░░▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓██▓▓▓▓▓▓▓▓██████████████▓▓▓▓▒▒");
        wait(15);
        mes("▓▓▒▒██▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒▒▒░░░░▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓██▒▒  ░░░░░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒▒▒████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓██████▓▓▓▓██▒▒");
        wait(15);
        mes("▒▒▓▓▒▒▓▓▒▒██▒▒▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒▒▒░░░░▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▒▒    ▒▒░░  ░░▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓██▒▒▒▒▓▓▒▒▓▓▓▓▓▓████▓▓▓▓▒▒▓▓▓▓██████████▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▒▒▒▒▓▓▒▒▓▓▓▓▒▒▓▓▒▒░░▓▓██▒▒  ░░▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▒▒  ░░▒▒░░  ░░▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒██▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▒▒▓▓▒▒██▓▓▓▓▓▓▓▓▓▓▓▓");
        wait(15);
        mes("▓▓░░▒▒▒▒▓▓▓▓▒▒██▓▓░░▓▓▓▓▒▒▓▓██░░░░░░▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓░░▓▓░░▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ██▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▒▒░░▓▓▓▓▒▒");
        wait(15);
        mes("▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓████░░▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒  ░░▒▒▓▓██▓▓▓▓▓▓▒▒▓▓▒▒▓▓▒▒▒▒▓▓▓▓▓▓██");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██████████░░▓▓░░▒▒░░░░▒▒▒▒▒▒▒▒  ▓▓▓▓▓▓██░░▒▒██████▓▓▒▒▒▒░░▒▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ░░▓▓▓▓▓▓██▓▓██▒▒░░▓▓▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓");
        wait(15);
        mes("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████░░██░░░░▒▒░░▒▒▓▓▒▒▒▒▒▒▓▓████▒▒▒▒▒▒▓▓██▓▓▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓████▓▓▒▒▓▓▓▓▓▓▓▓░░░░▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓");
        wait(15);
        mes("▒▒▒▒▓▓▓▓▓▓████████████████████░░██▓▓▓▓████▓▓▓▓▓▓▒▒▓▓████▒▒░░▒▒░░▒▒██▒▒▒▒▒▒░░░░░░░░░░▓▓▒▒▒▒▒▒▓▓▒▒░░▒▒▓▓██░░▒▒▒▒▓▓▓▓▓▓▒▒▓▓██▒▒░░▒▒▒▒░░▒▒░░▒▒▓▓▓▓██░░▒▒▒▒▒▒");
        wait(15);
        mes("████████▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▒▒░░░░░░░░░░░░▒▒▒▒████░░░░░░░░░░██▒▒░░░░░░░░░░░░░░▒▒▒▒▒▒░░▓▓░░░░░░████▒▒▓▓▒▒▓▓▓▓██▓▓██▒▒░░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓██▒▒▒▒▒▒▒▒");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓▓██▓▓░░░░░░░░░░██░░░░░░░░░░░░░░░░▒▒▒▒▓▓▒▒▒▒░░░░░░▓▓████▒▒▒▒▒▒▓▓██▒▒░░░░▒▒▓▓▒▒▒▒▒▒░░▒▒░░▓▓▓▓██▒▒▒▒▒▒▒▒");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██▓▓░░██░░░░░░░░░░▒▒░░░░░░░░░░░░░░░░▒▒░░██▓▓██▓▓░░░░▓▓████▒▒▓▓▒▒▒▒▓▓▒▒░░░░░░░░░░░░░░░░░░░░▓▓▒▒▒▒██▒▒▒▒▒▒");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒██▓▓▒▒░░░░░░░░▒▒░░░░░░░░░░░░░░▒▒▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓████▓▓▒▒▒▒▒▒██▒▒▒▒▒▒░░░░░░░░░░░░▒▒██░░░░██▓▓░░░░");
        wait(15);
        mes("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▒▒▒▒▒▒▓▓▓▓▓▓░░░░░░▒▒██▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▒▒▒▒██▓▓░░░░░░▒▒░░░░▒▒▒▒▓▓████▓▓██▓▓▒▒▒▒");
    }

    public static void art18() {
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██████████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁████████▁▁▁▁▁▁████████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██████▁▁▁▁▁▁██████▁▁▁▁▁▁██████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁████▁▁▁▁██████████████████▁▁▁▁████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁▁▁██████████████████████████▁▁▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁██████████████████████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁██████████████████████████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁████▁▁██████████████████████████████████████▁▁████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁██████▁▁██████████████████████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁████▁▁██████▁▁▁▁▁▁██████████████████████████████▁▁████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁████████▁▁██▁▁████████████████████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁████████▁▁██▁▁▁▁██████████████████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁████▁▁████▁▁▁▁▁▁██▁▁▁▁▁▁▁▁██████████████████████████▁▁████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁████▁▁▁▁██▁▁██▁▁▁▁██▁▁▁▁▁▁████████████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁██▁▁▁▁██▁▁▁▁██▁▁▁▁████▁▁▁▁▁▁▁▁████████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁▁▁▁▁██▁▁██▁▁██▁▁██▁▁██▁▁████▁▁▁▁██████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁████▁▁████▁▁██▁▁██▁▁██▁▁████▁▁██▁▁▁▁▁▁▁▁████████████▁▁████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁██▁▁████▁▁██▁▁████▁▁██▁▁████▁▁████▁▁▁▁████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁██▁▁██▁▁▁▁██▁▁▁▁██▁▁████▁▁██▁▁████▁▁██▁▁▁▁████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁████▁▁████▁▁▁▁██▁▁▁▁████▁▁██▁▁████▁▁██▁▁████▁▁▁▁▁▁████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁██▁▁██▁▁██▁▁██▁▁██▁▁████▁▁██▁▁████▁▁██▁▁▁▁▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁████▁▁██▁▁████████████████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁██▁▁██▁▁██████████████████████████▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██▁▁▁▁██▁▁██████████████████████▁▁▁▁██▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁████▁▁▁▁██████████████████▁▁▁▁████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁██████▁▁▁▁▁▁██████▁▁▁▁▁▁██████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁████████▁▁▁▁▁▁████████▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
        wait(15);
        mes("▒▒░░░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░░░░░░░▁▁████▓▓▓▓██░░░░▁▁░░░░▒▒▒▒░░░░░░░░▒▒░░░░░░░░░░▁▁░░▁▁");
    }


}
//Code written by Buckley Wiley