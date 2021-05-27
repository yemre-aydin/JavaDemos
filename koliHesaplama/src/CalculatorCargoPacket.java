import jdk.jshell.spi.SPIResolutionException;

public  class CalculatorCargoPacket extends InformationMaterials {


    public boolean calculatorPacket(int seven_weight_piece, int two_weight_piece, int target_cargo_weight) {
        int seven_count = 0;
        int two_count = 0;
        int rest_targetWeight = 0;
        int rest_targetWeight2 = 0;
        PrepareCargoPacket calculator_result = new PrepareCargoPacket();




        seven_count = target_cargo_weight / 7;
        rest_targetWeight = target_cargo_weight % 7;


        if (rest_targetWeight == 0 && seven_count <= seven_weight_piece) {
            calculator_result.prepareResult(2,target_cargo_weight,seven_count,two_count);


           // System.out.println(hedef_kargo_kilo + " ulaşmak için: " + seven_sayac + " adet 7kg ve " + two_sayac + " Adet 2 kg sabun ile "
             //       + hedef_kargo_kilo + "'lık paket oluşturabilirsiniz. ");


        }
        if (rest_targetWeight == 0 && seven_count > seven_weight_piece) {

            calculator_result.prepareResult(-1,target_cargo_weight,seven_count,two_count);


            // System.out.println("7 kg ve 2 kg'lık paketlerle "+hedef_kargo_kilo+" ulaşamassınız.777");

        }

        if (rest_targetWeight != 0) {
            two_count = rest_targetWeight / 2;
            rest_targetWeight2 = rest_targetWeight % 2;
            if (rest_targetWeight2 == 0 && two_count <= two_weight_piece && seven_count <= seven_weight_piece) {

                calculator_result.prepareResult(2,target_cargo_weight,seven_count,two_count);


               // System.out.println(hedef_kargo_kilo + " ulaşmak için: " + seven_sayac + " adet 7kg ve "
                 //       + two_sayac + " Adet 2 kg sabun ile "
                   //     + hedef_kargo_kilo + "'lık paket oluşturabilirsiniz. ");

            }
            if (rest_targetWeight2 == 0 && two_count > two_weight_piece|| seven_count > seven_weight_piece) {
                calculator_result.prepareResult(-1,target_cargo_weight,seven_count,two_count);


                //  System.out.println("7 kg ve 2 kg'lık paketlerle " + hedef_kargo_kilo + " ulaşamassınız.6666");


            }
            if (rest_targetWeight2 != 0) {
                //ayrı bir public void de fordongüsü nü kopyala ve
                //burada sadece çağırmayı dene
                for (int j = 1; j <= seven_count; j++) {
                    seven_count -= j;
                    rest_targetWeight = rest_targetWeight + (j * 7);
                    two_count= rest_targetWeight / 2;
                    rest_targetWeight2 = rest_targetWeight % 2;
                    if (rest_targetWeight2 == 0 && two_count <= two_weight_piece && seven_count <= seven_weight_piece) {
                        calculator_result.prepareResult(2,target_cargo_weight,seven_count,two_count);


                        //    System.out.println(hedef_kargo_kilo + " ulaşmak için: " + seven_sayac + " adet 7kg ve "
                      //          + two_sayac + " Adet 2 kg sabun ile "
                        //        + hedef_kargo_kilo + "'lık paket oluşturabilirsiniz. ");
                        break;
                    }
                    if (rest_targetWeight2 == 0 && two_count > two_weight_piece || seven_count > seven_weight_piece) {
                        calculator_result.prepareResult(-1,target_cargo_weight,seven_count,two_count);


                        // System.out.println("7 kg ve 2 kg'lık paketlerle " + hedef_kargo_kilo + " ulaşamassınız. 222");
                    }

                }
                if (seven_count == 0 && rest_targetWeight2!= 0) {
                    calculator_result.prepareResult(-1,target_cargo_weight,seven_count,two_count);



                }


            }
        }



    return finishPro();
    }


}
    /*
    public void calculatorResult(int calculator_resul){
   //     int calculator_result=0;//sonucu 2ve -1 ise packet calculator e bidir olacak ???

        if (calculator_resul==2){

            System.out.println("Başarılı: "+calculator_resul);

        }
        if (calculator_resul==-1){
            System.out.println("Başarısız: "+calculator_resul);

        }



    }*/

