
import java.util.Random;
import java.util.ArrayList;
public class main{
        static Random generator;
        static String[] names =
        {"Darrell","Giancarlo","Elisha","Junior","Zackery","Alvaro","Lewis","Valentin","Deacon",
        "Jase","Harry","Kendall","Rashad","Finnegan","Mohammed","Ramiro","Cedric","Brennen",
        "Santino","Stanley","Tyrone","Chace","Francis","Johnathon","Teagan","Zechariah",
        "Alonso","Kaeden","Kamden","Gilberto","Ray","Karter","Luciano","Nico","Kole","Aryan",
        "Draven","Jamie","Misael","Lee","Alexzander","Camren","Giovanny","Amare","Rhett","Rhys",
        "Rodolfo","Nash","Markus","Deven","Mohammad","Moshe","Quintin","Dwayne","Memphis","Atticus",
        "Davian","Eugene","Jax","Antoine","Wayne","Randall","Semaj","Uriah","Clark","Aidyn","Jorden",
        "Maxim","Aditya","Lawson","Messiah","Korbin","Sullivan","Freddy","Demarcus","Neil","Brice",
        "King","Davon","Elvis","Ace","Dexter","Heath",
        "Duncan","Jamar","Sincere","Irvin","Remington","Kadin","Soren","Tyree","Damarion",
        "Talan","Adrien","Gilbert","Keenan","Darnell","Adolfo","Tristian","Derick","Isai","Rylee","Gauge","Harold","Kareem","Deangelo","Agustin","Coleman","Zavier","Lamar","Emery","Jaydin","Devan","Jordyn","Mathias","Prince","Sage","Seamus","Jasiah","Efrain"
        ,"Darryl","Arjun","Mike","Roland","Conrad","Kamron","Hamza","Santos","Frankie","Dominique",
        "Marley","Vance","Dax","Jamir","Kylan","Todd","Maximo","Jabari","Matthias",
        "Haiden","Luka","Marcelo","Keon","Layton","Tyrell","Kash","Raiden","Cullen","Donte"
        ,"Jovani","Cordell","Kasen","Rory","Alfred","Darwin","Ernest","Bailey","Gaige","Hassan","Jamarcus","Killian","Augustus","Trevin","Zain","Ellis","Rex","Yusuf","Bruno",
        "Jaidyn","Justus","Ronin","Humberto","Jaquan","Josh","Kasey","Winston","Dashawn","Lucian","Matias","Sidney","Ignacio","Nigel","Van","Elian","Finley","Jaron","Addison"
        ,"Aedan","Braedon","Jadyn","Konner","Zayne","Franco","Niko","Savion","Cristofer","Deon","Krish","Anton","Brogan","Cael","Coby","Kymani","Marcel","Yair","Dale","Bo","Jordon","Samir","Darien","Zaire","Ross","Vaughn","Devyn","Kenyon","Clay","Dario","Ishaan","Jair","Kael","Adonis","Jovanny","Clinton","Rey","Chaim","German","Harper","N
        athen","Rigoberto","Sonny","Glenn","Octavio","Blaze","Keshawn","Ralph","Ean","Nikhi
        l","Rayan","Sterling","Branson","Jadiel","Dillan","Jeramiah","Koen","Konnor","Antwa
        n","Houston","Tyrese","Dereon","Leonidas","Zack","Fisher","Jaydan","Quinten","Nick"
        ,"Urijah","Darion","Jovan","Salvatore","Beckham","Jarrett","Antony","Eden","Makai",
        "Zaiden","Broderick","Camryn","Malaki","Nikolai","Howard","Immanuel","Demarion","Va
        lentino","Jovanni","Ayaan","Ethen","Leandro","Royce","Yael","Yosef","Jean","Marquis
        e","Alden","Leroy","Gaven","Jovany","Tyshawn","Aarav","Kadyn","Milton","Zaid","Kelt
        on","Tripp","Kamren","Slade","Hezekiah","Jakobe","Nathanial","Rishi","Shamar","Geov
        anni","Pranav","Roderick","Bentley","Clarence","Lyric","Bernard","Carmelo","Denzel"
        ,"Maximillian","Reynaldo","Cassius","Gordon","Reuben","Samson","Yadiel","Jayvon","R
        eilly","Sheldon","Abdullah","Jagger","Thaddeus","Case","Kyson","Lamont","Chaz","Mak
        hi","Jan","Marques","Oswaldo","Donavan","Keyon","Kyan","Simeon","Trystan","Andreas"
        ,"Dangelo","Landin","Reagan","Turner","Arnav","Brenton","Callum","Jayvion","Bridger
        ","Sammy","Deegan","Jaylan","Lennon","Odin","Abdiel","Jerimiah","Eliezer","Bronson"
        ,"Cornelius","Pierre","Cortez","Baron","Carlo","Carsen","Fletcher","Izayah","Kolten
        ","Damari","Hugh","Jensen","Yurem",
        "Emma","Isabella","Emily","Madison","Ava","Olivia","Sophia","Abigail","Elizabeth","
        Chloe","Samantha","Addison","Natalie","Mia","Alexis","Alyssa","Hannah","Ashley","El
        la","Sarah","Grace","Taylor","Brianna","Lily","Hailey","Anna","Victoria","Kayla","L
        illian","Lauren","Kaylee","Allison","Savannah","Nevaeh","Gabriella","Sofia","Makayl
        a","Avery","Riley","Julia","Leah","Aubrey","Jasmine","Audrey","Katherine","Morgan",
        "Brooklyn","Destiny","Sydney","Alexa","Kylie","Brooke","Kaitlyn","Evelyn","Layla","
        Madeline","Kimberly","Zoe","Jessica","Peyton","Alexandra","Claire","Madelyn","Maria
        ","Mackenzie","Arianna","Jocelyn","Amelia","Angelina","Trinity","Andrea","Maya","Va
        leria","Sophie","Rachel","Vanessa","Aaliyah","Mariah","Gabrielle","Katelyn","Ariana
        ","Bailey","Camila","Jennifer","Melanie","Gianna","Charlotte","Paige","Autumn","Pay
        ton","Faith","Sara","Isabelle","Caroline","Genesis","Isabel","Mary","Zoey","Gracie"
        ,"Megan","Haley","Mya","Michelle","Molly","Stephanie","Nicole","Jenna","Natalia","S
        adie","Jada","Serenity","Lucy","Ruby","Eva","Kennedy","Rylee","Jayla","Naomi","Rebe
        cca","Lydia","Daniela","Bella","Keira","Adriana","Lilly","Hayden","Miley","Katie","
        Jade","Jordan","Gabriela","Amy","Angela","Melissa","Valerie","Giselle","Diana","Ama
        nda","Kate","Laila","Reagan","Jordyn","Kylee","Danielle","Briana","Marley","Leslie"
        ,"Kendall","Catherine","Liliana","Mckenzie","Jacqueline","Ashlyn","Reese","Marissa"
        ,"London","Juliana","Shelby","Cheyenne","Angel","Daisy","Makenzie","Miranda","Erin"
        ,"Amber","Alana","Ellie","Breanna","Ana","Mikayla","Summer","Piper","Adrianna","Jil
        lian","Sierra","Jayden","Sienna","Alicia","Lila","Margaret","Alivia","Brooklynn","K
        aren","Violet","Sabrina","Stella","Aniyah","Annabelle","Alexandria","Kathryn","Skyl
        ar","Aliyah","Delilah","Julianna","Kelsey","Khloe","Carly","Amaya","Mariana","Chris
        tina","Alondra","Tessa","Eliana","Bianca","Jazmin","Clara","Vivian","Josephine","De
        laney","Scarlett","Elena","Cadence","Alexia","Maggie","Laura","Nora","Ariel","Elise
        ","Nadia","Mckenna","Chelsea","Lyla","Alaina","Jasmin","Hope","Leila","Caitlyn","Ca
        ssidy","Makenna","Allie","Izabella","Eden","Callie","Haylee","Caitlin","Kendra","Ka
        rina","Kyra","Kayleigh","Addyson","Kiara","Jazmine","Karla","Camryn","Alina","Lola"
        ,"Kyla","Kelly","Fatima","Tiffany","Kira","Crystal","Mallory","Esmeralda","Alejandr
        a","Eleanor","Angelica","Jayda","Abby","Kara","Veronica","Carmen","Jamie","Ryleigh"
        ,"Valentina","Allyson","Dakota","Kamryn","Courtney","Cecilia","Madeleine","Aniya","
        Alison","Esther","Heaven","Aubree","Lindsey","Leilani","Nina","Melody","Macy","Ashl
        ynn","Joanna","Cassandra","Alayna","Kaydence","Madilyn","Aurora","Heidi","Emerson",
        "Kimora","Madalyn","Erica","Josie","Katelynn","Guadalupe","Harper","Ivy","Lexi","Ca
        mille","Savanna","Dulce","Daniella","Lucia","Emely","Joselyn","Kiley","Kailey","Mir
        iam","Cynthia","Rihanna","Georgia","Rylie","Harmony","Kiera","Kyleigh","Monica","Be
        thany","Kaylie","Cameron","Teagan","Cora","Brynn","Ciara","Genevieve","Alice","Madd
        ison","Eliza","Tatiana","Jaelyn","Erika","Ximena","April","Marely","Julie","Danica"
        ,"Presley","Brielle","Julissa","Angie","Iris","Brenda","Hazel","Rose","Malia","Shay
        la","Fiona","Phoebe","Nayeli","Paola","Kaelyn","Selena","Audrina","Rebekah","Caroli
        na","Janiyah","Michaela","Penelope","Janiya","Anastasia","Adeline","Ruth","Sasha","
        Denise","Holly","Madisyn","Hanna","Tatum","Marlee","Nataly","Helen","Janelle","Lizb
        eth","Serena","Anya","Jaslene","Kaylin","Jazlyn","Nancy","Lindsay","Desiree","Hayle
        y","Itzel","Imani","Madelynn","Asia","Kadence","Madyson","Talia","Jane","Kayden","A
        nnie","Amari","Bridget","Raegan","Jadyn","Celeste","Jimena","Luna","Yasmin","Emilia
        ","Annika","Estrella","Sarai","Lacey","Ayla","Alessandra","Willow","Nyla","Dayana",
        "Lilah","Lilliana","Natasha","Hadley","Harley","Priscilla","Claudia","Allisson","Ba
        ylee","Brenna","Brittany","Skyler","Fernanda","Danna","Melany","Cali","Lia","Macie"
        ,"Lyric","Logan","Gloria","Lana","Mylee","Cindy","Lilian","Amira","Anahi","Alissa",
        "Anaya","Lena","Ainsley","Sandra","Noelle","Marisol","Meredith","Kailyn","Lesly","J
        ohanna","Diamond","Evangeline","Juliet","Kathleen","Meghan","Paisley","Athena","Hai
        lee","Rosa","Wendy","Emilee","Sage","Alanna","Elaina","Cara","Nia","Paris","Casey",
        "Dana","Emery","Rowan","Aubrie","Kaitlin","Jaden","Kenzie","Kiana","Viviana","Norah
        ","Lauryn","Perla","Amiyah","Alyson","Rachael","Shannon","Aileen","Miracle","Lillie
        ","Danika","Heather","Kassidy","Taryn","Tori","Francesca","Kristen","Amya","Elle","
        Kristina","Cheyanne","Haylie","Patricia","Anne","Samara","Skye","Kali","America","L
        exie","Parker","Halle","Londyn","Abbigail","Linda","Hallie","Saniya","Bryanna","Bai
        lee","Jaylynn","Mckayla","Quinn","Jaelynn","Jaida","Caylee","Jaiden","Melina","Abri
        l","Sidney","Kassandra","Elisabeth","Adalyn","Kaylynn","Mercedes","Yesenia","Ellian
        a","Brylee","Dylan","Isabela","Ryan","Ashlee","Daphne","Kenya","Marina","Christine"
        ,"Mikaela","Kaitlynn","Justice","Saniyah","Jaliyah","Ingrid","Marie","Natalee","Joy
        ","Juliette","Simone","Adelaide","Krystal","Kennedi","Mila","Tamia","Addisyn","Ayli
        n","Dayanara","Sylvia","Clarissa","Maritza","Virginia","Braelyn","Jolie","Jaidyn","
        Kinsley","Kirsten","Laney","Marilyn","Whitney","Janessa","Raquel","Anika","Kamila",
        "Aria","Rubi","Adelyn","Amara","Ayanna","Teresa","Zariah","Kaleigh","Amani","Carla"
        ,"Yareli","Gwendolyn","Paulina","Nathalie","Annabella","Jaylin","Tabitha","Deanna",
        "Madalynn","Journey","Aiyana","Skyla","Yaretzi","Ada","Liana","Karlee","Jenny","Myl
        a","Cristina","Myah","Lisa","Tania","Isis","Jayleen","Jordin","Arely","Azul","Helen
        a","Aryanna","Jaqueline","Lucille","Destinee","Martha","Zoie","Arielle","Liberty","
        Marlene","Elisa","Isla","Noemi","Raven","Jessie","Aleah","Kailee","Kaliyah","Lilyan
        a","Haven","Tara","Giana","Camilla","Maliyah","Irene","Carley","Maeve","Lea","Macey
        ","Sharon","Alisha","Marisa","Jaylene","Kaya","Scarlet","Siena","Adyson","Maia","Sh
        iloh","Tiana","Jaycee","Gisselle","Yazmin","Eve","Shyanne","Arabella","Sherlyn","Sa
        riah","Amiya","Kiersten","Madilynn","Shania","Aleena","Finley","Kinley","Kaia","Ali
        ya","Taliyah","Pamela","Yoselin","Ellen","Carlie","Monserrat","Jakayla","Reyna","Ya
        ritza","Carolyn","Clare","Lorelei","Paula","Zaria","Gracelyn","Kasey","Regan","Alen
        a","Angelique","Regina","Britney","Emilie","Mariam","Jaylee","Julianne","Greta","El
        yse","Lainey","Kallie","Felicity","Zion","Aspen","Carlee","Annalise","Iliana","Lari
        ssa","Akira","Sonia","Catalina","Phoenix","Joslyn","Anabelle","Mollie","Susan","Jud
        ith","Destiney","Hillary","Janet","Katrina","Mareli","Ansley","Kaylyn","Alexus","Gi
        a","Maci","Elsa","Stacy","Kaylen","Carissa","Haleigh","Lorena","Jazlynn","Milagros"
        ,"Luz","Leanna","Renee","Shaniya","Charlie","Abbie","Caily
        n","Cherish","Elsie","Jazmyn","Elaine","Emmalee","Luciana","Dahlia","Jamya","Belind
        a","Mariyah","Chaya","Dayami","Rhianna","Yadira","Aryana","Rosemary","Armani","Cece
        lia","Celia","Barbara","Cristal","Eileen","Rayna","Campbell","Amina","Aisha","Amira
        h","Ally","Araceli","Averie","Mayra","Sanaa","Patience","Leyla","Selah","Zara","Cha
        nel","Kaiya","Keyla","Miah","Aimee","Giovanna","Amelie","Kelsie","Alisson","Angelin
        e","Dominique","Adrienne","Brisa","Cierra","Paloma","Isabell","Precious","Alma","Ch
        arity","Jacquelyn","Janae","Frances","Shyla","Janiah","Kierra","Karlie","Annabel","
        Jacey","Karissa","Jaylah","Xiomara","Edith","Marianna","Damaris","Deborah","Jaylyn"
        ,"Evelin","Mara","Olive","Ayana","India","Kendal","Kayley","Tamara","Briley","Charl
        ee","Nylah","Abbey","Moriah","Saige","Savanah","Giada","Hana","Lizeth","Matilda","A
        nn","Jazlene","Gillian","Beatrice","Ireland","Karly","Mylie","Yasmine","Ashly","Ken
        na","Maleah","Corinne","Keely","Tanya","Tianna","Adalynn","Ryann","Salma","Areli","
        Karma","Shyann","Kaley","Theresa","Evie","Gina","Roselyn","Kaila","Jaylen","Natalya
        ","Meadow","Rayne","Aliza","Yuliana","June","Lilianna","Nathaly","Ali","Alisa","Ara
        cely","Belen","Tess","Jocelynn","Litzy","Makena","Abagail","Giuliana","Joyce","Libb
        y","Lillianna","Thalia","Tia","Sarahi","Zaniyah","Kristin","Lorelai","Mattie","Tani
        ya","Jaslyn","Gemma","Valery","Lailah","Mckinley","Micah","Deja","Frida","Brynlee",
        "Jewel","Krista","Mira","Yamilet","Adison","Carina","Karli","Magdalena","Stephany",
        "Charlize","Raelynn","Aliana","Cassie","Mina","Karley","Shirley","Marlie","Alani","
        Taniyah","Cloe","Sanai","Lina","Nola","Anabella","Dalia","Raina","Mariela","Ariella
        ","Bria","Kamari","Monique","Ashleigh","Reina","Alia","Ashanti","Lara","Lilia","Jus
        tine","Leia","Maribel","Abigayle","Tiara","Alannah","Princess","Sydnee","Kamora","P
        aityn","Payten","Naima","Gretchen","Heidy","Nyasia","Livia","Marin","Shaylee","Mary
        jane","Laci","Nathalia","Azaria","Anabel","Chasity","Emmy","Izabelle","Denisse","Em
        elia","Mireya","Shea","Amiah","Dixie","Maren","Averi"};
        static String[] baseServices = {
            "food",
            "water",
            "fuel",
            "data center",
            "passes"
        };
        static int[][] enneagramCombos = {
            {1,4,7},
            {1,7,4},
            {2,4,8},
            {2,8,4},
            {3,6,9},
            {3,9,6},
            {4,1,2},
            {4,2,1},
            {5,7,8},
            {5,8,7},
            {6,9,3},
            {6,3,9},
            {7,1,5},
            {7,5,1},
            {8,2,5},
            {8,5,2},
            {9,3,6},
            {9,6,3},
        };
        static int[][] enneagramCompat = {
            {1,2,9},
            {2,4,8},
            {3,1,9},
            {4,2,9},
            {5,1},
            {6,8,9,2},
            {7,5,1},
            {8,2,9},
            {9,4,6}
        };
        static int[][] enneagramNonCompat = {
            {7},
            {},
            {},
            {8},
            {9},
            {},
            {},
            {4},
            {5}
        };
        static <T> T pickRandom(T[] array){
            int rnd = generator.nextInt(array.length);
            return array[rnd];
        }
        static class Place{
            public int est = 0;
            public String name = "example";
            public int value = 0;
            int startingNumber = 0;
            ArrayList<NPC> residents;
            ArrayList<String> services;
            String[] neighbors;
            NPC[] popular;
            NPC[] unpopular;

            public Place(String iName, int iStartingNumber){
                name = iName;
                startingNumber = iStartingNumber;
                residents = addRandomCharacters(startingNumber);
                getServices();
            }
            public Place(String iName){
                name = iName;
                startingNumber = generator.nextInt(100);
                residents = addRandomCharacters(startingNumber);
            }
            public Place(){
                name = (generator.nextFloat()<.5) ? pickRandom(names) + "'s " +
                pickRandom(names) : pickRandom(names)+"ton";
                startingNumber = generator.nextInt(100);
                residents = addRandomCharacters(startingNumber);
            }
            public int increaseAge(){
                return est++;
            }
            public ArrayList<NPC> addRandomCharacters(int iStartingNumber){
                ArrayList<NPC> temp = new ArrayList<NPC>();
                for(int i =0; i<iStartingNumber; i++){
                temp.add(new NPC());
                }
                return temp;
            }

            public void getServices(){
                if(services.isEmpty()){
                int rnd = generator.nextInt(10);
                value = rnd*1000;
                for(int i =0; i< rnd; i++){
                services.add(pickRandom(baseServices));
                    }
                }
            }
        }
        static class NPC{
            String name = "examplePerson";
            int age = 0;
            int[] enneagram = {1,4,7};
            int happiness = 100;
            int boredom = 50;
            String[] memories;
            String[] thoughts;
            String[] knowledge;
            NPC[] friends;
            NPC[] enemies;
            String icon = "";
            String home = "This Base";
            String[] travels = {"This Base"};
            public NPC(){
            name = pickRandom(names);
            enneagram = pickRandom(enneagramCombos);
            age = generator.nextInt(90) + 10;
            }
            public class Interaction {
                private String type;
                private int kindnessPoints;
            
                public Interaction() {
                    Random random = new Random();
                    int interactionType = random.nextInt(2);
            
                    if (interactionType == 0) {
                        this.type = "Friendly";
                        this.kindnessPoints = random.nextInt(11) + 10;
                    } else {
                        this.type = "Unfriendly";
                        this.kindnessPoints = random.nextInt(11) - 20;
                    }
                }
            
                public String getType() {
                    return type;
                }
            
                public int getKindnessPoints() {
                    return kindnessPoints;
                }
            }
    



        }
        public class Skills {
            private String fighterType;
            private int skillLevel;
        
            public Skills() {
                Random random = new Random();
                int type = random.nextInt(4);
        
                switch (type) {
                    case 0:
                        this.fighterType = "Archer";
                        break;
                    case 1:
                        this.fighterType = "Mage";
                        break;
                    case 2:
                        this.fighterType = "Sword and Shield";
                        break;
                    case 3:
                        this.fighterType = "Fighter";
                        break;
                }
        
                this.skillLevel = random.nextInt(100) + 1;
            }
        
            public String getFighterType() {
                return fighterType;
            }
        
            public int getSkillLevel() {
                return skillLevel;
            }
        }

        static class Character extends NPC{
            Skills mySkills = new Skills();
            System.out.println("Fighter type: " + mySkills.getFighterType());
            System.out.println("Skill level: " + mySkills.getSkillLevel());
            String name = "exmaple";
            int life = 100;
             Skills [][] talents = [];
             String home = "House";
             int [][] currentPosition = [][];
             String [] knowledge = [];
             int [] enneagram = [1,4,7];
        }

        public static void main(String[] args){
            generator = new Random();
            for(int i =0; i<5; i++){
            Place p = new Place();
            System.out.println(">>>>>>>>>>>>>>>>>" + p.name + " "+
            p.startingNumber);
            for(NPC n: p.residents){
            System.out.println(n.name+" "+n.enneagram[0]);
            }
            }
        }
}
