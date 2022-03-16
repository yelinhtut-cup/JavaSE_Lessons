package com.review.lesson1;

import java.util.Scanner;

public class Interset_Calculating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int interest,account_type,day;
        int language;
        long debit;
        double result;
        System.out.println(" 'Please choose language' (1 for English, 2 for Myanmar)\n 'ကျေးဇူးပြု၍ ဘာသာစကားရွေးချယ်ပါ။' (အဂ်လိပ်ဘာသာအတွက် ၁ ကိုနှိပ်ပါ, မြန်မာဘာသာအတွက် ၂ ကိုနှိပ်ပါ)");
        language=sc.nextInt();
        //English language
        if (language==1) {
            System.out.println("\b'YOMA BANK ACCOUNTS'");
            System.out.println("'Please enter your account type'");

            System.out.println("Account type: 101 => Smart Account");
            System.out.println("Account type: 102 => Current Account");
            System.out.println("Account type: 441 => Saving Account");
            System.out.println("Account type: 451 => Call Account");
            System.out.println("Account type: 461 => Fixed Account");
            System.out.println("Account type: 453 => JZU Account");
            System.out.println("Account type: 454 => Flexi Cash Account");
            System.out.println("Account type: 455 => Flexi Connect Account");
            account_type = sc.nextInt();

            System.out.println("Enter your debit money");
            debit = sc.nextInt();

            switch (account_type) {
                case 101:
                    System.out.println("Your account is smart account. This account cannot get inerest.Thank you!");
                    break;
                case 102:
                    System.out.println("Your account is current account. This account cannot get inerest.Thank you!");
                    break;
                case 441:
                    result = (debit * 0.05) / 12;
                    System.out.println("Your account is saving account.Interest is 5%per year.Thank you!");
                    System.out.println("Interest of debit money: " + result);

                case 451:
                    System.out.println("Your account is call account.");
                    System.out.println("Enter the day of debit money that start counting from first of debit");
                    day = sc.nextInt();
                    if (debit >= 100000) {
                        result = ((debit * 0.04) / 365) * day;
                        System.out.println("Interest is 4% per year.Thank you!");
                        System.out.println("Interest of debit money: " + result);
                    } else
                        System.out.println("You don't have any interest because your debit money is less than 1 lakh.");
                    break;
                case 461:
                    System.out.println("Your account is fixed account.");
                    System.out.println("'The day of interest rate'");
                    System.out.println(" 30days => 7.5%\n 60days => 7.5%\n 90days => 8.25%\n 180days => 8.35%\n 270days => 8.45%\n 365days => 8.5%\n ");
                    System.out.println("Enter the day that you have been checked.");
                    day = sc.nextInt();
                    if (day == 30 || day == 60) {
                        result = debit * 0.075;
                        System.out.println("Interest of debit money: " + result);
                    } else if (day == 90) {
                        result = debit * 0.0825;
                        System.out.println("Interest of debit money: " + result);
                    } else if (day == 180) {
                        result = debit * 0.0835;
                        System.out.println("Interest of debit money: " + result);
                    } else if (day == 270) {
                        result = debit * 0.0845;
                        System.out.println("Interest of debit money: " + result);
                    } else if (day == 365) {
                        result = debit * 0.085;
                        System.out.println("Interest of debit money: " + result);
                    }
                    break;
                case 453:
                    System.out.println("Your account is JZU account.");
                    System.out.println("Enter the day of debit money that start counting from first of debit");
                    day = sc.nextInt();
                    result = ((debit * 0.03) / 365) * day;
                    System.out.println("Interest is 4% per year.Thank you!");
                    System.out.println("Interest of debit money: " + result);
                    break;
                case 454:
                    if (debit > 1000000000) {
                        long extra = debit - 1000000000;
                        result = (debit * 0.07) + (extra * 0.01);
                        System.out.println("Your account is flexi cash account.Interest is 7% to 10000 laks.\n If above 10000laks,1% of above money are add to 7% of amount.");
                        System.out.println("Interest of debit money: " + result);
                    } else if (debit >= 10000 && debit <= 1000000000) {
                        result = debit * 0.07;
                        System.out.println("Interest of debit money: " + result);
                    }
                    break;
                case 455:
                    System.out.println("Your account is flexi connect account.Currently this account is allowed for Wave Agent");
                    result = (debit * 0.05) / 12;
                    System.out.println("Interest of debit money: " + result);
                    break;

            }
        }
        //Burmese language
        else if (language==2){
            System.out.println("\b'ရိုးမဘဏ် ငွေစာရင်းများ'");
            System.out.println("'ကျေးဇူးပြု၍ လူကြီးမင်း၏ ငွေစာရင်းအမျိုးအစားကိုဖြည့်သွင်းပါ'");

            System.out.println("ငွေစာရင်းအမျိုးအစား : 101 => စမတ်အကောင့်(Smart)");
            System.out.println("ငွေစာရင်းအမျိုးအစား : 102 => စာရင်းရှင်အပ်ငွေ");
            System.out.println("ငွေရင်းအမျိုးအစား : 441 => ငွေစုစာအုပ်(လစဉ်အတိုး)");
            System.out.println("ငွေရင်းအမျိုးအစား : 451 =>ငွေစုစာအုပ်(နေ့စဉ်အတိုး) ");
            System.out.println("ငွေစာရင်းအမျိုးအစား : 461 => စာရင်းသေအပ်ငွေ");
            System.out.println("ငွေစာရင်းအမျိုးအစား : 453 => ကျေးဇူးအကောင့်");
            System.out.println("ငွေစာရင်းအမျိုးအစား : 454 => Flexi Cash Account");
            System.out.println("ငွေစာရင်းအမျိုးအစား : 455 => Flexi Connect Account");
            account_type = sc.nextInt();

            System.out.println("လူကြီးမင်း၏ အပ်ငွေကိုဖြည့်သွင်းပါ");
            debit = sc.nextInt();

            switch (account_type) {
                case 101:
                    System.out.println("လူကြီးမင်း၏ အကောင့်အမျိုးအစားသည် စမတ်အကောင့်ဖြစ်ပြီး ဤအကောင့်အမျိုးအစားသည် အတိုးမရရှိနိုင်ပါ။ကျေးဇူးတင်ပါသည်");
                    break;
                case 102:
                    System.out.println("လူကြီးမင်း၏ အကောင့်အမျိုးအစားသည် စာရင်းရှင်အကောင့်ဖြစ်ပြီး ဤအကောင့်အမျိုးအစားသည် အတိုးမရရှိနိုင်ပါ။ကျေးဇူးတင်ပါသည်");
                    break;
                case 441:
                    result = (debit * 0.05) / 12;
                    System.out.println("လူကြီးမင်း၏ အကောင့်အမျိုးအစားသည် ငွေစု(လစဉ်အတိုး)အကောင့်ဖြစ်ပြီး အတိုးနှုန်းမှာတစ်နှစ်စာအတွက် ၅ရာခိုင်နှုန်း။ကျေးဇူးတင်ပါသည်");
                    System.out.println("အပ်ငွေ၏အတိုး : " + result);

                case 451:
                    System.out.println("လူကြီးမင်း၏ အကောင့်အမျိုးအစားသည် ငွေစု(နေ့စဉ်အတိုး)အကောင့်ဖြစ်ပြီး အတိုးနှုန်းမှာတစ်နှစ်စာအတွက် ၄ရာခိုင်နှုန်း။\nတစ်သိန်းမှစတင်၍ အတိုးတွက်ပေးပါသည်။ကျေးဇူးတင်ပါသည်");
                    System.out.println("ကျေးဇူးပြု၍အပ်ငွေ စတင်အပ်နှံသည့်နေ့မှ ယနေ့အထိရက်ပေါင်းကို ဖြည့်သွင်းပါ");
                    day = sc.nextInt();
                    if (debit >= 100000) {
                        result = ((debit * 0.04) / 365) * day;
                        System.out.println("အပ်ငွေ၏အတိုး " + result);
                    } else
                        System.out.println("လူကြီးမင်း၏ အပ်ငွေသည် တစ်သိန်းကျပ်အောက်လျော့နည်းနေသောကြောင့် အတိုးမရနိုင်ပါ။ကျေးဇူးတင်ပါသည်။");
                    break;
                case 461:
                    System.out.println("လူကြီးမင်း၏ အကောင့်အမျိုးအစားသည် စာရင်းသေအပ်ငွေအကောင့်ဖြစ်သည်။");
                    System.out.println("'ဘဏ်မှသတ်မှတ်ထားသော အတိုးပေးသောရက်များ'");
                    System.out.println(" ၃၀ရက် => ၇.၅%\n ၆၀ရက် => ၇.၅%\n ၉၀ရက် => ၈.၂၅%\n ၁၈၀ရက် => ၈.၃၅%\n ၂၇၀ရက်=> ၈.၄၅%\n ၃၆၅ရက် => ၈.၅%\n ");
                    System.out.println("လူကြီးမင်းရွေးချယ်ခဲ့သော ရက်ကိုဖြည့်သွင်းပါ");
                    day = sc.nextInt();
                    if (day == 30 || day == 60) {
                        result = debit * 0.075;
                        System.out.println("အပ်ငွေ၏အတိုး " + result);
                    } else if (day == 90) {
                        result = debit * 0.0825;
                        System.out.println("အပ်ငွေ၏အတိုး " + result);
                    } else if (day == 180) {
                        result = debit * 0.0835;
                        System.out.println("အပ်ငွေ၏အတိုး " + result);
                    } else if (day == 270) {
                        result = debit * 0.0845;
                        System.out.println("အပ်ငွေ၏အတိုး " + result);
                    } else if (day == 365) {
                        result = debit * 0.085;
                        System.out.println("အပ်ငွေ၏အတိုး " + result);
                    }
                    break;
                case 453:
                    System.out.println("လူကြီးမင်း၏ အကောင့်အမျိုးအစားသည် ကျေးဇူးအကောင့်ဖြစ်သည်။အတိုးနှုန်းမှာတစ်နှစ်စာအတွက် ၃ရာခိုင်နှုန်း။ကျေးဇူးတင်ပါသည်");
                    System.out.println("ကျေးဇူးပြု၍အပ်ငွေ စတင်အပ်နှံသည့်နေ့မှ ယနေ့အထိရက်ပေါင်းကို ဖြည့်သွင်းပါ");
                    day = sc.nextInt();
                    result = ((debit * 0.03) / 365) * day;
                    System.out.println("အပ်ငွေ၏အတိုး " + result);
                    break;
                case 454:
                    if (debit > 1000000000) {
                        long extra = debit - 1000000000;
                        result = (debit * 0.07) + (extra * 0.01);
                        System.out.println("လူကြီးမင်း၏ အကောင့်အမျိုးအစားသည် flexi cashအမျိုးအစားဖြစ်ပြီး အတိုးနှုန်းမှာ တစ်သောင်းမှ သိန်းတစ်သောင်းအထိ ၇ရာခိုင်နှုန်း။ \nသိန်းတစ်သောင်းကျော်ပါက ကျော်သောပမာဏ၏ ၁ရာခိုင်နှုန်းကိုအတိုးထပ်ပေါင်းတွက်ပေးပါသည်။");
                        System.out.println("အပ်ငွေ၏အတိုး " + result);
                    } else if (debit >= 10000 && debit <= 1000000000) {
                        result = debit * 0.07;
                        System.out.println("အပ်ငွေ၏အတိုး " + result);
                    }
                    break;
                case 455:
                    System.out.println("လူကြီးမင်း၏ အကောင့်အမျိုးအစားသည် flexi connectအမျိုးအစားဖြစ်ပြီး လက်ရှိအချိန်တွင် Wave Agentလုပ်ကိုင်သူများသာ အသုံးပြုနိုင်ပါသည်။");
                    result = (debit * 0.05) / 12;
                    System.out.println("အပ်ငွေ၏အတိုး " + result);
                    break;

            }
        }



    }
}
