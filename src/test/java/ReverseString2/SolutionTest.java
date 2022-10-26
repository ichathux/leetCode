package ReverseString2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1(){
        assertEquals ("bacdfeg", new Solution ().reverseStr ("abcdefg",2));
    }
    @Test
    public void test2(){
        assertEquals ("cbadef", new Solution ().reverseStr ("abcdef",3));
    }
    @Test
    public void test3(){
        assertEquals ("cbadefhg", new Solution ().reverseStr ("abcdefgh",3));
    }
    @Test
    public void test4(){
        assertEquals ("fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi",
                new Solution ().reverseStr ("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl",39));
    }
    @Test
    public void test5(){
        assertEquals ("snckewqxnlosfnhnalnysfkfcrfcqmqktwuyizqnlqjnqvovauyshznbpytpjedprnrtddwbjqozzuxfkxthibxixsjptbevpqhujglqoojonjysdojfmqltiycomchaimgtuzimjgzibrudtxcxkeoiaovjdvaexczqdjvsgpmrcobpqtxzdtrhqwezeocegncbrcdthruynmgmjxzjvqoyfalxxwkmghhupzwplqnmwqcgkanmrcqplekgimzmhsxmcwqxvajeecwhgyvincuueiwftkffvltgqaahxfssweghunimpybrxwijqwcygavozuonbuzrulgxkzzgtwzctliaotynbytymqaozhqxeczpzvdqeitvguliscffodggyfxrlcqsyluzakjtyvoqfupvuqwxfsksvoryausbyewyrouqpfkipyuyhwifzihlzwxjtpyunfjznmdxvktpnbixjfudewhhmqwzqbjdpkkvtiodeapzofadsyzlchgupazrbylzjtbhfskbcwpluixxtaoprivwhhzyswchkwacdqzkkmmvuapadaqmrsjkbimclqkqlkivtronaigqphkngagcafmzzkqmzohirgerguaqreauvnaxinxlrrcwjlvppvphjuqybokadwbcisrkdhsdtpvboyzdmbknqbsjtsvlholzsnpeqjzjbtguviuhvoqjtzhtryieqjslrcvcyqdsktlvadmgbbxpsrdomcdgbdvjmkqyxuotjhvuvttbfbfwrkffjxwcuymldqehulkzjfvlcqvvvbtjuqlcepdeexuedxuzpuxrgixbbujnfrmsnyamvmrepkivwziwphulaajgjfwidnywjihpqltuziqbgznsahldvxvucahtephlhldvlpbmkuxezgjmdtyoemubxhqaytgroicgdzrmzxrynluigbrvsnsonclqicpxnywwqjcxhwdeucawoopeyxbelkwd",
                new Solution ().reverseStr ("zxjmgmnyurhtdcrbcngecoezewqhrtdzxtqpbocrmpgsvjdqzcxeavdjvoaioekxcxtdurbizgjmizutgmiahcmocyitlqmfjodsyjnojooqlgjuhqpvebtpjsxixbihtxkfxuzzoqjbwddtrnrpdejptypbnzhsyuavovqnjqlnqziyuwtkqmqcfrcfkfsynlanhnfsolnxqwekcnsjvqoyfalxxwkmghhupzwplqnmwqcgkanmrcqplekgimzmhsxmcwqxvajeecwhgyvincuueiwftkffvltgqaahxfssweghunimpybrxwijqwcygavozuonbuzrulgxkzzgtwzctliaotynbytymqaozhqxeczpzvdqeitvguliscffodggyfxrlcqsyluzakjtyvoqfupvuqwxfsksvovuaerqaugregrihozmqkzzmfacgagnkhpqgianortviklqkqlcmibkjsrmqadapauvmmkkzqdcawkhcwsyzhhwvirpoatxxiulpwcbksfhbtjzlybrzapughclzysdafozpaedoitvkkpdjbqzwqmhhwedufjxibnptkvxdmnzjfnuyptjxwzlhizfiwhyuypikfpquoryweybsuayrnaxinxlrrcwjlvppvphjuqybokadwbcisrkdhsdtpvboyzdmbknqbsjtsvlholzsnpeqjzjbtguviuhvoqjtzhtryieqjslrcvcyqdsktlvadmgbbxpsrdomcdgbdvjmkqyxuotjhvuvttbfbfwrkffjxwcuymldqehulkzjfvlcqvvvbtjuqlcepdeexuedxuzpuxrgixbbujnfrmsdwklebxyepoowacuedwhxcjqwwynxpciqlcnosnsvrbgiulnyrxzmrzdgciorgtyaqhxbumeoytdmjgzexukmbplvdlhlhpethacuvxvdlhasnzgbqizutlqphijwyndiwfjgjaaluhpwizwvikpermvmayn",211));
    }

}