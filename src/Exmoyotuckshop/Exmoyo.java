/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exmoyotuckshop;


import java.util.Date;
import java.util.Scanner;


public class Exmoyo {
//the main class and all follows below are attribute of the class exmoyo

    Scanner s = new Scanner(System.in);
// to allow the user the use to enter anything during the program flow

    String[] names = new String[3];
// its a string for teller names since the size of the array is 3 ,it only conatai three tallers
    int[] age = new int[3];//the ages of the tellers
    String[] gender = new String[3];// the gender of the tellers

    int SelectItemToBuy; // for selection items to buy

    // variable for Payments
    double Amount;
    double balance;
    double TotalPriceOfAllItemSold;
    double vat;

    // for date and time date in the reciept
    Date mydate = new Date();

    // instance Variables
    int TellerCount;
    int Itemcount;
    int AdminChoiceMenu;
    double price;
    String AddNewTeller;
    int All_Item_InStock;
    double changePrice;

    // All Item and their initial pricess
    public double Coke_Price = 16.90;
    public double Fanta_Price = 15.90;
    public double Sprite_Price = 9.0;
    public double Ginger_Price = 10.60;
    public double Orange_Price = 5.60;
    public double Pine_Price = 11.90;
    public double Rusberry_Price = 4.60;
    public double Cream_Soda_Price = 6.90;
    public double Lemon_Price = 11.0;
    public double Grape_Price = 15.20;

    // variables for all Stock
    public int Total_Coke = 0;
    public int Total_Fanta = 0;
    public int Total_Sprite = 0;
    public int Total_Ginger = 0;
    public int Total_Orange = 0;
    public int Total_Pine = 0;
    public int Total_Rusberry = 0;
    public int Total_Cream_Soda = 0;
    public int Tota_Lemon = 0;
    public int Total_Grape = 0;

    //These variable will hold product sold
    public String Item = "";
    public int Coke_Sold;
    public int Fanta_Sold;
    public int Sprite_Sold;
    public int Ginger_Sold;
    public int Orange_Sold;
    public int Pine_Sold;
    public int Rusberry_Sold;
    public int Cream_Soda_Sold;
    public int Lemon_Sold;
    public int Grape_Sold;

    //single product totals total
    public double Coke_total1;
    public double Fanta_total2;
    public double Sprite_total3;
    public double Ginger_total4;
    public double Orange_total5;
    public double Pine_total6;
    public double Rusberry_total7;
    public double Cream_Soda_total8;
    public double Lemon_total9;
    public double Grape_total10;

    //These are containers that will hold the Qunatities of Each Item Bought
    public int Coke_quantity;
    public int Fanta_quantity;
    public int Sprite_quantity;
    public int Ginger_quantity;
    public int Orange_quantity;
    public int Pine_quantity;
    public int Rusberry_quantity;
    public int Cream_Soda_quantity;
    public int Lemon_quantity;
    public int Grape_quantity;

    // default contructor
    public Exmoyo() {
        Itemcount = 0;
        price = 0;
        AddNewTeller = "";
        All_Item_InStock = 0;
    }
    //method for the main menu

    public void Main_Menu() {
        System.out.println("###################################");
        System.out.println("         Exmoyo kiosk           ");
        System.out.println("*           Welcome               *");
        System.out.println("*      632 karondera street     *");
        System.out.println("****     Motto: Toramari united ****");
        System.out.println("");
        System.out.println("###################################");
        System.out.println("");
        System.out.println("1. Login As Admin");
        System.out.println("2. Login As Teller");
        System.out.println("3. Quit\n");

    }
// method for accessing in admin menu
    public void adminPassword() {
        int password = 000;
        System.out.print("Enter password: ");
        password = s.nextInt();
        if (password == 000) {
            Admin_Menu();
        } else {
            System.out.println("wronge password...");
        }
    }

    //Admin Menu
    public void Admin_Menu() {
        System.out.println("######################### Admin Menu ###################\n");
        System.out.println(" 1. Re-Instock Product");
        System.out.println(" 2. Change Product Price");
        System.out.println(" 3. Add New Teller");
        System.out.println(" 4. Print Summary Of All Item In Stock");
        System.out.println(" 5. Print Only Item That Need Restock");
        System.out.println(" 6. To Main Menu");
        System.out.println("\n########################################################");
        System.out.print("Enter Choice: ");
        AdminChoiceMenu = s.nextInt();

        do {
// options within the admin menu
            switch (AdminChoiceMenu) {
                case 1:
                    addStock();
                    break;
                case 2:
                    changePrice();
                    break;
                case 3:
                    this.addNewTeller();
                    break;
                case 4:
                    summaryOfAllProduct();
                    break;
                case 5:
                    this.displayProductTOReinstack();
                    break;
                case 6:
                    this.Main_Menu();
                    break;
                default:
                    break;
            }

        } while (AdminChoiceMenu > 0 && AdminChoiceMenu < 3);

    }
    //  method for adding items  to stock
   
    public void addStock() {

        int addChoice;
        System.out.println("##########################################################################################");
        System.out.println("xxxx                       Adding Item To Stock                                 xxxx\n");
        System.out.println("**                             Add Item to Stock.                                       ..\n");
        System.out.println("##########################################################################################");
        System.out.println("1. Coke  \n2. Fanta \n3. Sprite \n4. Ginger \n5. Orange");
        System.out.println("6. Pine  \n7. Rusberry \n8. Cream Soda  \n9. Lemon  \n10. Grape       ");
        System.out.println("##########################################################################################");
        System.out.println("0. Exit\n");

        try {
            System.out.print("Choose Item : ");
            addChoice = s.nextInt();

            switch (addChoice) {
                case 1:
                    this.addCoke();
                    break;
                case 2:
                    this.addFanta();
                    break;
                case 3:
                    this.addSprite();
                    break;
                case 4:
                    this.addGinger();
                    break;
                case 5:
                    this.addOrange();
                    break;
                case 6:
                    this.addPine();
                    break;
                case 7:
                    this.addRusberry();
                    break;
                case 8:
                    this.addCreamSoda();
                    break;
                case 9:
                    this.addLemon();
                    break;
                case 10:
                    this.addGrape();
                    break;
                case 0:
                    this.Admin_Menu();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {          //in case if number enter are not within the range of 0 to 10
            System.out.println("Wronge Entry !!!");
        }

    }
    //method for adding coke

    public void addCoke() {
        while (true) {
            int NumOfCoke;
            if (Total_Coke >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of Coke is " + Total_Coke);
                break;
            } else if (Total_Coke < 25) {
                System.out.print("Enter number: ");
                NumOfCoke = s.nextInt();

                if (NumOfCoke + Total_Coke > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Coke is " + Total_Coke);
                    break;
                } else {
                    Total_Coke = Total_Coke + NumOfCoke;
                    System.out.println("Total Number Of Coke is " + Total_Coke);
                    break;
                }

            }
        }
    }
    //methodc for adding fanta

    public void addFanta() {
        while (true) {
            int NumOfFanta;
            if (Total_Fanta >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of fanta is " + Total_Fanta);
                break;
            } else if (Total_Fanta < 25) {
                System.out.print("Enter number: ");
                NumOfFanta = s.nextInt();

                if (NumOfFanta + Total_Fanta > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Fanta is " + Total_Fanta);
                    break;
                } else {
                    Total_Fanta = Total_Fanta + NumOfFanta;
                    System.out.println("Total Number Of Fanta is " + Total_Fanta);
                    break;
                }

            }
        }

    }
//method for adding sprite
    public void addSprite() {
        while (true) {
            int NumOfSprite;
            if (Total_Sprite >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of Sprite is " + Total_Sprite);
                break;
            } else if (Total_Sprite < 25) {
                System.out.print("Enter number: ");
                NumOfSprite = s.nextInt();

                if (NumOfSprite + Total_Sprite > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Sprite is " + Total_Sprite);
                    break;
                } else {
                    Total_Sprite = Total_Sprite + NumOfSprite;
                    System.out.println("Total Number Of Sprite is " + Total_Sprite);
                    break;
                }

            }
        }

    }

    // methos that adds ginger to the stock
    public void addGinger() {
        while (true) {
            int NumOfGinger;
            if (Total_Ginger >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of Ginger Gold is " + Total_Ginger);
                break;
            } else if (Total_Ginger < 25) {
                System.out.print("Enter number: ");
                NumOfGinger = s.nextInt();

                if (NumOfGinger + Total_Ginger > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Ginger is " + Total_Ginger);
                    break;
                } else {
                    Total_Ginger = Total_Ginger + NumOfGinger;
                    System.out.println("Total Number Of Ginger is " + Total_Ginger);
                    break;
                }

            }
        }

    }
    // method for adding orange

    public void addOrange() {
        while (true) {
            int NumOfOrange;
            if (Total_Orange >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of Orange is " + Total_Orange);
                break;
            } else if (Total_Orange < 25) {
               System.out.print("Enter number: ");
                NumOfOrange = s.nextInt();

                if (NumOfOrange + Total_Orange > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Orange is " + Total_Orange);
                    break;
                } else {
                    Total_Orange = Total_Orange + NumOfOrange;
                    System.out.println("Total Number Of Orange is " + Total_Orange);
                    break;
                }

            }
        }

    }
//method for adding pine
    public void addPine() {
        while (true) {

            int numOfPine;
            if (Total_Pine >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of Pine is " + Total_Pine);
                break;
            } else if (Total_Pine < 25) {
                System.out.print("Enter number: ");
                numOfPine = s.nextInt();

                if (numOfPine + Total_Pine > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Pine is " + Total_Pine);
                    break;
                } else {
                    Total_Pine = Total_Pine+ numOfPine;
                    System.out.println("Total Number Of Pine is " + Total_Pine);
                    break;
                }

            }
        }
    }
//method for adding rusberry
    public void addRusberry() {
        while (true) {

            int numOfRusberry;
            if (Total_Rusberry >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of Rusberry is " + Total_Rusberry);
                break;
            } else if (Total_Rusberry < 25) {
                System.out.print("Enter number: ");
                numOfRusberry = s.nextInt();

                if (numOfRusberry + Total_Rusberry > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Rusberry is " + Total_Rusberry);
                    break;
                } else {
                    Total_Rusberry = Total_Rusberry + numOfRusberry;
                    System.out.println("Total Number Of Rusberry is " + Total_Rusberry);
                    break;
                }

            }
        }
    }
//method for adding cream soda
    public void addCreamSoda() {
        while (true) {
            int numOfCreamSoda;
            if (Total_Cream_Soda >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of Cream Soda is " + Total_Cream_Soda);
                break;
            } else if (Total_Cream_Soda < 25) {
                System.out.print("Enter number: ");
               numOfCreamSoda = s.nextInt();

                if (numOfCreamSoda + Total_Cream_Soda > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Cream Soda is " + Total_Cream_Soda);
                    break;
                } else {
                    Total_Cream_Soda = Total_Cream_Soda + numOfCreamSoda;
                    System.out.println("Total Number Of Cream Soda is " + Total_Cream_Soda);
                    break;
                }

            }

        }

    }
//method for adding lemon in stock
    public void addLemon() {
        while (true) {

            int numOfLemon;
            if (Tota_Lemon >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of Lemon is " + Tota_Lemon);
                break;
            } else if (Tota_Lemon < 25) {
                System.out.print("Enter number: ");
                numOfLemon = s.nextInt();

                if (numOfLemon + Tota_Lemon > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Lemon is " + Tota_Lemon);
                    break;
                } else {
                    Tota_Lemon = Tota_Lemon + numOfLemon;
                    System.out.println("Total Number Of Lemon is " + Tota_Lemon);
                    break;
                }

            }
        }
    }
    // method for adding grape in stoke
    public void addGrape() {
        while (true) {
            int numOfGrape;
            if (Total_Grape >= 25) {
                System.out.println("Sorry!! No Space For Stock...");
                System.out.println("Total Number Of Grape is " + Total_Grape);
                break;
            } else if (Total_Grape < 25) {
                System.out.print("Enter number: ");
                numOfGrape = s.nextInt();

                if (numOfGrape + Total_Grape > 25) {
                    System.out.println("Sorry!!, Total Number is Beyond 25, Please reduce Quantity");
                    System.out.println("Total Number Of Grape is " + Total_Grape);
                    break;
                } else {
                    Total_Grape = Total_Grape + numOfGrape;
                    System.out.println("Total Number Of Grape is " + Total_Grape);
                    break;
                }

            }

        }
    }
    // Ending of adding to stock
   
    //  changing product price 
    
    public void changePrice() {

        int changeProductPrice = 0;
        System.out.println("##########################################################################################");
        System.out.println("xxxxxx                   Changing Product Price                                 xxxxxx\n");
        System.out.println("**                             Change of prices                                         **\n");
        System.out.println("**********************************************************************************************");
        System.out.println("1. Coke \n2. Fanta \n3. Sprite \n4. Ginger\n5. Orange");
                                                                                                   
        System.out.println("6. Pine  \n7. Rusberry \n8. Cream Soda  \n9. Lemon  \n10. Grape    ");
        System.out.println("**********************************************************************************************");
        System.out.println("0. Exit\n");

        System.out.print("Choose Item: ");
        changeProductPrice = s.nextInt();

        try {
            if (changeProductPrice == 1) {
                System.out.print("Change Price: ");
                changePrice = s.nextDouble();
                Coke_Price = changePrice;
                System.out.println("Coke: N$" + Coke_Price);
                System.out.println("Price successfully changed");
            }
            if (changeProductPrice == 2) {
                System.out.print("Change Price: ");
                changePrice = s.nextDouble();
                Fanta_Price = changePrice;
                System.out.println("Fanta: N$" + Fanta_Price);
                System.out.println("Price successfully changed");
            }
            if (changeProductPrice == 3) {
                System.out.print("Change Price: ");
                changePrice = s.nextDouble();
                Sprite_Price = changePrice;
                System.out.println("Sprite: N$" + Sprite_Price);
                System.out.println("Price successfully changed");
            }
            if (changeProductPrice == 4) {
                System.out.println("Change Price: ");
                changePrice = s.nextDouble();
                Ginger_Price = changePrice;
                System.out.println("Ginger: N$" + Ginger_Price);
                System.out.println("Price successfully changed");
            }
            if (changeProductPrice == 5) {
                System.out.println("Change Price: ");
                changePrice = s.nextDouble();
                Orange_Price = changePrice;
                System.out.println("Orange: N$" + Orange_Price);
                System.out.println("Price successfully changed");
            }
            if (changeProductPrice == 6) {
                System.out.println("Change Price: ");
                changePrice = s.nextDouble();
                Pine_Price = changePrice;
                System.out.println("Pine: N$" + Pine_Price);
                System.out.println("Price successfully changed");
            }
            if (changeProductPrice == 7) {
                System.out.println("Change Price: ");
                changePrice = s.nextDouble();
                Rusberry_Price = changePrice;
                System.out.println("Rusberry: N$" + Rusberry_Price);
                System.out.println("Price successfully changed");
            }
            if (changeProductPrice == 8) {
                System.out.println("Change Price: ");
                changePrice = s.nextDouble();
                Cream_Soda_Price = changePrice;
                System.out.println("Cream_Soda_Price: N$" + Cream_Soda_Price);
                System.out.println("Price successfully changed");
            }

            if (changeProductPrice == 9) {
                System.out.println("Change Price: ");
                changePrice = s.nextDouble();
                Lemon_Price = changePrice;
                System.out.println("Lemon: N$" + Lemon_Price);
                System.out.println("Price successfully changed");
            }
            if (changeProductPrice == 10) {
                System.out.println("Change Price: ");
                changePrice = s.nextDouble();
                Grape_Price = changePrice;
                System.out.println("Grape: N$" + Grape_Price);
            }

            if (changeProductPrice == 0) {
                this.Admin_Menu();
            }

        } catch (Exception e) {  // in case ifv details enterd are not within the rage of 0 to 10
            System.out.println("Wronge Entry !!!");
        }

    }
    //  end of price changing 
   
    // method for showing the Summary of all product in thestong
    
    public void summaryOfAllProduct() {
        int allStock;

        System.out.println("Select Option..\n");
        System.out.println("1. View All Stock\n0. Exit\n");

        System.out.print("Choose: ");
        allStock = s.nextInt();

        if (allStock == 1) {
            System.out.println("Summary of All Item in Stock\n");
            System.out.println("Total of Soda water: " + Total_Coke);
            System.out.println("Total of Tonic Water: " + Total_Fanta);
            System.out.println("Total of Guiness: " + Total_Sprite);
            System.out.println("Total of Hunters Gold: " + Total_Ginger);
            System.out.println("Total of Tafel: " + Total_Orange);
            System.out.println("Total of Windhoek Lagger: " + Total_Pine);
            System.out.println("Total of Smirnoff: " + Total_Rusberry);
            System.out.println("Total of Windhoek draught: " + Total_Cream_Soda);
            System.out.println("Total of Windhoek Light: " + Tota_Lemon);
            System.out.println("Total of Heineken: " + Total_Grape);
            System.out.println("");

            //summing all items and storing them in all item in stock variable
            All_Item_InStock = Total_Coke + Total_Fanta + Total_Sprite + Total_Ginger + Total_Orange
                    + Total_Pine+ Total_Rusberry + Total_Cream_Soda + Tota_Lemon
                    + Total_Grape;

            System.out.println("Summary Of All Item In Stock: " + All_Item_InStock);

            System.out.println("===============   PRICE LIST  =============");
            System.out.println("Price per one: N$" + Coke_Price);
            System.out.println("Price per one: N$" + Fanta_Price);
            System.out.println("Price per one: N$" + Sprite_Price);
            System.out.println("Price per one: N$" + Ginger_Price);
            System.out.println("Price per one: N$" + Orange_Price);
            System.out.println("Price per one: N$" + Pine_Price);
            System.out.println("Price per one: N$" + Rusberry_Price);
            System.out.println("Price per one: N$" + Cream_Soda_Price);
            System.out.println("Price per one: N$" + Lemon_Price);
            System.out.println("Price per one: N$" + Grape_Price);
            System.out.println("");
            System.out.print("1. Admin Menu: ");
            int exit = s.nextInt();
            if (exit == 1) {
                Admin_Menu();
            }

        } else if (allStock == 0) {
            this.Admin_Menu();
        }
    }

    //  method for showing Product to reinstock
    // #############################################################################################
    public void displayProductTOReinstack() {
        int optionForRestocking;

        System.out.println("Select Option..\n");
        System.out.println("1. View Items To Restock\n0. Exit\n");

        System.out.println("*** Items To Restock ***");
        System.out.print("Choose: ");
        optionForRestocking = s.nextInt();

        if (optionForRestocking == 1) {
            if (Total_Coke < 25) {
                System.out.println("Coke need restock\t\t" + Total_Coke);
            }
            if (Total_Fanta < 25) {
                System.out.println("Fanta need restock\t" + Total_Fanta);
            }
            if (Total_Sprite < 25) {
                System.out.println("Sprite need restock\t\t" + Total_Sprite);
            }
            if (Total_Ginger < 25) {
                System.out.println("Ginger need restock\t" + Total_Ginger);
            }
            if (Total_Orange < 25) {
                System.out.println("Orange need restock\t\t" + Total_Orange);
            }
            if (Total_Pine < 25) {
                System.out.println("Pine need restock\t" + Total_Pine);
            }
            if (Total_Rusberry < 25) {
                System.out.println("Rusberry need restock\t\t" + Total_Rusberry);
            }
            if (Total_Cream_Soda < 25) {
                System.out.println("Cream_Soda need restock\t" + Total_Cream_Soda);
            }
            if (Tota_Lemon < 25) {
                System.out.println("Lemon need restock\t" + Tota_Lemon);
            }
            if (Total_Grape < 25) {
                System.out.println("Grape need restock\t\t" + Total_Grape);
            }
            System.out.print("1. Admin Menu: ");
            int exit = s.nextInt();
            if (exit == 1) {
                Admin_Menu();
            }

        } else if (optionForRestocking == 0) {
            Admin_Menu();
        }
    }

    //  add a new Teller
    // #############################################################################################
    public void addNewTeller() {
        int AddNewTeller;
        int i = 0;
        System.out.println("Select Option..\n");
        System.out.println("1. Add new Teller\n2. View All Tellers\n0. Exit\n");

        System.out.print("Choose: ");
        AddNewTeller = s.nextInt();

        if (AddNewTeller == 1) {
            for (; i < 3; i++) {
                System.out.print("Enter Name: ");
                names[i] = s.next();

                System.out.print("enter age: ");
                age[i] = s.nextInt();

                System.out.print("Enter gender: ");
                gender[i] = s.next();
                System.out.println("Successfully added New Teller: " + names[i]);
                TellerCount = TellerCount + 1;
                break;
            }

            //increases the shop assistant by 1
            System.out.println("Number Of Shop Assistance: " + TellerCount);
            addNewTeller();
        }

        if (AddNewTeller == 2) {
            System.out.println("Number Of Shop Assistance: " + TellerCount + "\n");
            System.out.println("Teller Name: " + names[i]);
            System.out.println("Teller age: " + age[i]);
            System.out.println("Tellers gender: " + gender[i]);// prints all the Tellers name
            System.out.println("");
            System.out.print("1.  Back: ");
            int exit = s.nextInt();
            if (exit == 1) {
                addNewTeller();
            }
        }

        if (AddNewTeller == 0) {
            this.Admin_Menu();
        }
    }

    //  method Selling items in the stock 
    
    public void saleProduct() {

        int addChoice;
        System.out.println("***********************************  Sell Menu ***********************************************");
        System.out.println("xxxx                                  x WELCOME x                                           xxxxx");
        System.out.println("**********************************************************************************************");
        System.out.println("1. Coke \n2. Fanta \n3. Sprite \n4. Ginger\n5. Orange");
        System.out.println("6. Pine \n7. Rusberry  \n8. Cream Sada  \n9. Lemon \n10. Grape    ");
        System.out.println("**********************************************************************************************");
        System.out.println("0. Exit\n");

        try {
            System.out.print("Choose Item : ");
            addChoice = s.nextInt();

            switch (addChoice) {
                case 1:
                    this.sellCoke();
                    break;
                case 2:
                    this.sellFanta();
                    break;
                case 3:
                    this.sellSprite();
                    break;
                case 4:
                    this.sellGinger();
                    break;
                case 5:
                    this.sellOrange();
                    break;
                case 6:
                    this.sellPine();
                    break;
                case 7:
                    this.sellRusberry();
                    break;
                case 8:
                    this.sellCream_Soda();
                    break;
                case 9:
                    this.sellLemon();
                    break;
                case 10:
                    this.sellGrape();
                    break;
                case 0:
                    Teller_Menu();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Wronge Entry !!!");
        }

    }

    // method of selling Coke
    // #############################################################################################
    public void sellCoke() {
        while (true) {

            System.out.println("** You are Buying Coke **");
            if (Total_Coke <= 0) {
                System.out.println("Sorry no Coke available at the moment.. Thank you");
                System.out.println("Available : " + Total_Coke);

                break;
            } else if (SelectItemToBuy > Total_Coke) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Total_Coke);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();
                if (SelectItemToBuy > 25 || SelectItemToBuy > Total_Coke) {
                    System.out.println("Sorry .... either item is more than stock or item is less than stock ");
                    break;
                } else {
                    Total_Coke = Total_Coke - SelectItemToBuy;
                    System.out.println("Coke Sold: " + SelectItemToBuy);
                    System.out.println("Available : " + Total_Coke);

                    Coke_Sold = Coke_Sold + SelectItemToBuy;
                    Coke_total1 = SelectItemToBuy * Coke_Price;
                    Coke_quantity = SelectItemToBuy;

                  //  break;
                }
break;
            }
        }
    }

    //method of selling  Fanta
    // #############################################################################################
    public void sellFanta() {
        while (true) {

            System.out.println("** You are Buying Fanta **");
            if (Total_Fanta <= 0) {
                System.out.println("Sorry no Fanta available at the moment.. Thank you");
                System.out.println("Available : " + Total_Fanta);

                break;
            } else if (SelectItemToBuy > Total_Fanta) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Total_Fanta);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();
                Total_Fanta = Total_Fanta - SelectItemToBuy;
                System.out.println("Fanta Sold: " + SelectItemToBuy);
                System.out.println("Available : " + Total_Fanta);

                Fanta_Sold = Fanta_Sold + SelectItemToBuy;
                Fanta_total2 = SelectItemToBuy * Fanta_Price;
                Fanta_quantity = SelectItemToBuy;

                break;
            }
        }
    }

    //  method of selling Sprite
    // #############################################################################################
    public void sellSprite() {
        while (true) {

            System.out.println("** You are Buying Guiness **");
            if (Total_Sprite <= 0) {
                System.out.println("Sorry no Sprite available at the moment.. Thank you");
                System.out.println("Available : " + Total_Sprite);

                break;
            } else if (SelectItemToBuy > Total_Sprite) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Total_Sprite);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();

                Total_Sprite = Total_Sprite - SelectItemToBuy;
                System.out.println("Sprite Sold: " + SelectItemToBuy);
                System.out.println("Available : " + Total_Sprite);

                Sprite_Sold = Sprite_Sold + SelectItemToBuy;
                Sprite_total3 = SelectItemToBuy * Sprite_Price;
                Sprite_quantity = SelectItemToBuy;

                break;
            }
        }
    }

    // sell Ginger
    // #############################################################################################
    public void sellGinger() {
        while (true) {

            System.out.println("** You are Buying Ginger **");
            if (Total_Ginger <= 0) {
                System.out.println("Sorry no Ginger available at the moment.. Thank you");
                System.out.println("Available : " + Total_Ginger);
                break;
            } else if (SelectItemToBuy > Total_Ginger) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Total_Ginger);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();

                Total_Ginger = Ginger_Sold - SelectItemToBuy;
                System.out.println(" Ginger Sold: " + SelectItemToBuy);
                System.out.println("Available : " + Total_Ginger);

                Ginger_Sold = Ginger_Sold + SelectItemToBuy;
                Ginger_total4 = SelectItemToBuy * Ginger_Price;
                Ginger_quantity = SelectItemToBuy;
                break;
            }
        }
    }

    // method for selling Orange
    // #############################################################################################
    public void sellOrange() {
        while (true) {

            System.out.println("** You are Buying Orange **");
            if (Total_Orange <= 0) {
                System.out.println("Sorry no Orange available at the moment.. Thank you");
                System.out.println("Available : " + Total_Orange);
                break;
            } else if (SelectItemToBuy > Total_Orange) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Total_Orange);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();

                Total_Orange = Total_Orange - SelectItemToBuy;
                System.out.println("Orange Sold: " + SelectItemToBuy);
                System.out.println("Available : " + Total_Orange);

                Orange_Sold = Orange_Sold + SelectItemToBuy;
                Orange_total5 = SelectItemToBuy * Orange_Price;
                Orange_quantity = SelectItemToBuy;
                break;
            }
        }
    }

    // method for selling Pine
    // #############################################################################################
    public void sellPine() {
        while (true) {

            System.out.println("** You are Buying Pine **");
            if (Total_Pine <= 0) {
                System.out.println("Sorry no Pine available at the moment.. Thank you");
                System.out.println("Available : " + Total_Pine);
                break;
            } else if (SelectItemToBuy > Total_Pine) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Total_Pine);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();

                Total_Pine = Total_Pine - SelectItemToBuy;
                System.out.println("Pine: " + SelectItemToBuy);
                System.out.println("Available : " + Total_Pine);

                Pine_Sold = Pine_Sold + SelectItemToBuy;
                Pine_total6 = SelectItemToBuy * Pine_Price;
                Pine_quantity = SelectItemToBuy;
                break;
            }

        }
    }

    // method for selling Rusberry
    // #############################################################################################
    public void sellRusberry() {
        while (true) {

            System.out.println("** You are Buying Rusberry **");
            if (Total_Rusberry <= 0) {
                System.out.println("Sorry no Rusberry available at the moment.. Thank you");
                System.out.println("Available : " + Total_Rusberry);
                break;
            } else if (SelectItemToBuy > Total_Rusberry) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Total_Rusberry);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();

                Total_Rusberry = Total_Rusberry - SelectItemToBuy;
                System.out.println("Rusberry Sold: " + SelectItemToBuy);
                System.out.println("Available : " + Total_Rusberry);

                Rusberry_Sold = Rusberry_Sold + SelectItemToBuy;
                Rusberry_total7 = SelectItemToBuy * Rusberry_Price;
                Rusberry_quantity = SelectItemToBuy;
                break;
            }

        }

    }

    //method for selling Cream Soda
    // #############################################################################################
    public void sellCream_Soda() {
        while (true) {
            System.out.println("** You are Buying Cream_Soda **");
            if (Total_Cream_Soda <= 0) {
                System.out.println("Sorry no Cream_Soda available at the moment.. Thank you");
                System.out.println("Available : " + Total_Cream_Soda);
                break;
            } else if (SelectItemToBuy > Total_Cream_Soda) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Total_Cream_Soda);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();

                Total_Cream_Soda = Total_Cream_Soda- SelectItemToBuy;
                System.out.println("Cream_Soda_Sold: " + SelectItemToBuy);
                System.out.println("Available : " + Total_Cream_Soda);

                Cream_Soda_Sold = Cream_Soda_Sold + SelectItemToBuy;
                Cream_Soda_total8 = SelectItemToBuy * Cream_Soda_Price;
                Cream_Soda_quantity = SelectItemToBuy;
                break;
            }

        }
    }

    // method for selling Lemon
    // #############################################################################################
    public void sellLemon() {
        while (true) {
            System.out.println("** You are Buying WindHoek Light **");
            if (Tota_Lemon <= 0) {
                System.out.println("Sorry no Lemont available at the moment.. Thank you");
                System.out.println("Available : " + Tota_Lemon);
                break;
            } else if (SelectItemToBuy > Tota_Lemon) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Tota_Lemon);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();

                Tota_Lemon = Tota_Lemon - SelectItemToBuy;
                System.out.println("Lemon Sold: " + SelectItemToBuy);
                System.out.println("Available : " + Tota_Lemon);

                Lemon_Sold = Lemon_Sold + SelectItemToBuy;
                Lemon_total9 = SelectItemToBuy * Lemon_Price;
                Lemon_quantity = SelectItemToBuy;
                break;
            }

        }
    }

    // method for selling grape 
    // #############################################################################################
    public void sellGrape() {
        while (true) {
            System.out.println("** You are Buying Heineken **");
            if (Total_Grape <= 0) {
                System.out.println("Sorry no Grape available at the moment.. Thank you");
                System.out.println("Available : " + Total_Grape);
                break;
            } else if (SelectItemToBuy > Total_Grape) {
                System.out.println("Sorry Can't Proceed with this Transaction.. Quantity is Greater than Stock");
                System.out.println("Available : " + Total_Grape);
                break;
            } else {
                System.out.print("Enter Quantity: ");
                SelectItemToBuy = s.nextInt();

                Total_Grape = Total_Grape - SelectItemToBuy;
                System.out.println("Grape Sold: " + SelectItemToBuy);
                System.out.println("Available : " + Total_Grape);

                Grape_Sold = Grape_Sold + SelectItemToBuy;
                Grape_total10 = SelectItemToBuy * Grape_Price;
                Grape_quantity = SelectItemToBuy;
                break;
            }

        }

    }

    // Summary Of All item Sold
    // #############################################################################################
    public void summaryOfProductSold() {
        int SelectItemToSold;

        System.out.println("Select Item To Buy...\n");
        System.out.println("1. List of Item Sold\n0. Exit");

        System.out.println("NOTE: Only Numbers Are Allowed...");
        System.out.print("Choose Item : ");
        SelectItemToSold = s.nextInt();

        if (SelectItemToSold == 1) {
            System.out.println("Coke_Sold: " + Coke_Sold);
            System.out.println("Fanta_Sold: " + Fanta_Sold);
            System.out.println("Sprite_Sold: " + Sprite_Sold);
            System.out.println("Ginger_Sold: " + Ginger_Sold);
            System.out.println("Orange_Sold: " + Orange_Sold);
            System.out.println("Pine_Sold: " + Pine_Sold);
            System.out.println("Rusberry_Sold: " + Rusberry_Sold);
            System.out.println("Rusberry_Sold: " + Cream_Soda_Sold);
            System.out.println("Lemon_Sold: " + Lemon_Sold);
            System.out.println("Grape_Sold: " + Grape_Sold);
            System.out.println("");
            System.out.print("1.  Back: ");
            int exit = s.nextInt();
            if (exit == 1) {
                Teller_Menu();

            }
        }
        if (SelectItemToSold == 0) {
            Teller_Menu();

        }
    }

    //method for Receipt
    // #############################################################################################
    public void Receipt() {

        int Receipt;

        System.out.println("Select Item To Buy...\n");
        System.out.println("1. print Reciept\n0. Exit");

        System.out.println("NOTE: Only Numbers Are Allowed...");
        System.out.print("Choose Item : ");
        Receipt = s.nextInt();

        if (Receipt == 1) {

            System.out.println("\n         Exmoyo kiosk        ");
            System.out.println("***********************************");
            System.out.println("*             Address             *");
            System.out.println("*        632 karondera street        *");
            System.out.println("");
            System.out.println("Name \t Quantity \t Price \t1 Total");
            System.out.println("");

            if (Coke_Sold > 0) {
                System.out.println("Coke " + "\t" + Coke_quantity + "\t" + Coke_Price + "\t" + Coke_total1);
            }

            if (Fanta_Sold > 0) {
                System.out.println("Fanta " + "\t" + Fanta_quantity + "\t" + Fanta_Price + "\t"+Fanta_total2);
            }

            if (Sprite_Sold > 0) {
                System.out.println("Sprite " + "\t" + Sprite_quantity + "\t" + Sprite_Price + "\t" +Sprite_total3);
            }

            if (Ginger_Sold > 0) {
                System.out.println("Ginger " + "\t" + Ginger_quantity + "\t" + Ginger_Price + "\t" + Ginger_total4);
            }

            if (Orange_Sold > 0) {
                System.out.println("Orange " + "\t" + Orange_quantity + "\t" + Orange_Price + "\t" + Orange_total5);
            }

            if (Total_Pine> 0) {
                System.out.println("Pine " + "\t" + Pine_quantity + "\t" + Pine_Price + "\t" + Pine_total6);
            }

            if (Total_Rusberry > 0) {
                System.out.println("Rusberry " + "\t" + Rusberry_quantity + "\t" + Rusberry_Price + "\t" + Rusberry_total7);
            }

            if (Total_Cream_Soda > 0) {
                System.out.println("Cream Soda " + "\t" + Cream_Soda_quantity+ "\t" + Cream_Soda_Price + "\t" + Cream_Soda_total8);
            }

            if (Tota_Lemon > 0) {
                System.out.println("Lemon " + "\t" + Lemon_quantity + "\t" +Lemon_Price + "\t" + Lemon_total9);
            }

            if (Total_Grape >0) {
                System.out.println("Heineken " + "\t" + Grape_quantity + "\t" + Grape_Price + "\t" + Grape_total10);
            }

            //this  will  holds the Total Price of all product sold
            TotalPriceOfAllItemSold = Total_Coke + Total_Fanta + Total_Sprite + Total_Ginger + Total_Orange
                    + Total_Pine + Total_Rusberry + Total_Cream_Soda + Tota_Lemon + Total_Grape;

            vat = TotalPriceOfAllItemSold * 0.15;  // Vat
            balance = balance - TotalPriceOfAllItemSold;

            System.out.println("*************************************");
            System.out.println("\t Vat@ 15% \t " + vat);
            System.out.println("Total\t\t\t " + TotalPriceOfAllItemSold);
            System.out.println("Tender\t\t\t 00");
            System.out.println("Change\t\t\t " + balance);
            System.out.println("");
            System.out.println("*************************************\n");
            System.out.println("Date: " + mydate.toString());
            System.out.println("Cashier: \t" + names);
            System.out.println("\n***********************************\n");
            System.out.println("        Thanks For your Support  ");
            System.out.println("           come tomorrow !!!!     \n");
            System.out.println("\n***********************************");
            System.out.println("");
            System.out.print("1.  Back: ");
            int exit = s.nextInt();
            if (exit == 1) {
                addNewTeller();
            }
        }
        if (Receipt == 0) {
            Teller_Menu();

        }

    }

    // Method for Paymement
    // #############################################################################################
    public void Payment() {
        System.out.print("Enter Amount: ");
        Amount = s.nextDouble();

        while (true) {
            if (Amount > TotalPriceOfAllItemSold) {
                balance = Amount - TotalPriceOfAllItemSold;
                saleProduct();
                break;
            } else if (Amount < TotalPriceOfAllItemSold) {
                System.out.println("Sorry!!, Insufficient Fund.");
                saleProduct();
                break;
            } else if (Amount == TotalPriceOfAllItemSold) {
                balance = 0;
                saleProduct();
                break;
            }

        }
        saleProduct();

    }
    // method for teller for accesssing teller menu

    public void TellerPasword() {
        int password = 111;
        System.out.print("Enter Teller Password: ");
        password = s.nextInt();

        if (password == 111) {
            this.Teller_Menu();
        } else {
            System.out.println("Sorry!!! Invalid Password... Try again");
        }
    }

//    // Exmoyo Teller Menu
    public void Teller_Menu() {
        System.out.println("########  Teller Menu  #######\n");
        System.out.println("1. make Sales");
        System.out.println("2. Print All Product Sold");
        System.out.println("3. Receipt");
        System.out.println("4. make Payment");
        System.out.println("5. Main Menu");
        System.out.println("################################");

        int TellerChoice;
        System.out.println("Choice: ");
        TellerChoice = s.nextInt();

        do {
            switch (TellerChoice) {
                case 1:
                    saleProduct();
                    break;
                case 2:
                    summaryOfProductSold();
                case 3:
                    Receipt();

                case 4:
                    Payment();
                case 5:
                    Main_Menu();
            }
        } while (TellerChoice != 5);

    }

}
