import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UtilTest {

    @Test
    public void 引数で受け取ったString型のデータがint型であるかを判定() {
        var expected = false;
        var result = Util.isNumber("aaa");
        assertEquals(expected, result);

        result = Util.isNumber("20000000000000000000000");
        assertEquals(expected, result);

        expected = true;
        result = Util.isNumber("200");
        assertEquals(expected, result);

    }




    @Test
    public void 引数に受け取った文字列が郵便番号の形式であるかを判定する() {
        //文字列はfalse
        var expected = false;
        var result = Util.isPostalCode("aaa");
        assertEquals(expected, result);
    }

    @Test
    public void 引数に受け取った文字列が郵便番号の形式であるかを判定する2() {
        //7桁の数字ならtrue
        var expected = true;
        var result = Util.isPostalCode("1234567");
        assertEquals(expected, result);
    }
    @Test
    public void 引数に受け取った文字列が郵便番号の形式であるかを判定する3() {
        var expected = true;
        var result = Util.isPostalCode("000-0000");
        assertEquals(expected, result);
    }



    //引数に受け取った文字列が小文字のアルファベットのみで構成されているかどうかを判定する

    @Test
    public void 小文字のアルファベット以外の文字が含まれていない場合true() {
        var expected = true;
        var result = Util.isSmallAlphabet("abcdefg");
        assertEquals(expected, result);


    }
    @Test
    public void 小文字のアルファベット以外の文字が含まれている場合false() {
        var expected = false;
        var result = Util.isSmallAlphabet("ABCdefg");
        assertEquals(expected, result);

    }


    @Test
    public void nullや空文字の場合false() {
        var expected = false;
        var result = Util.isSmallAlphabet("");
        assertEquals(expected, result);

    }




//引数に受け取った3つの数値を3辺として三角形が作成できるか判別
// 三角形　-> 2つの辺の長さを足し合わせると残りの1つの辺の長さより長くなる。

    @Test
    public void 三角形が作れない場合false() {
        var expected = false;
        var result = Util.isTriangle(5,6,1);
        assertEquals(expected, result);

    }
    @Test
    public void 三角形が作れる場合true() {
        var expected = true;
        var result = Util.isTriangle(5,5,5);
        assertEquals(expected, result);

    }

    @Test
    public void イント超えたらfalse() {
        var expected = false;
        var result = Util.isTriangle(2147483648L,5L,5L);
        assertEquals(expected, result);

    }

//0 ～ 100000までの値を引数に受け取り、
// 受け取った数が何かしらの整数を2乗した数値であった場合、その整数を返却します

    @Test
    public void 整数の2乗ならその整数を返す() {
        var expected = 4;
        var result = Util.isSquareNumber(16);
        assertEquals(expected, result);

    }


    @Test
    public void 整数の2乗ならでなければマイナス１を返す() {
        var expected = -1;
        var result = Util.isSquareNumber(15);
        assertEquals(expected, result);

    }
    @Test
    public void 一万より大きいとマイナス一() {
        var expected = -1;
        var result = Util.isSquareNumber(100000000);
        assertEquals(expected, result);

    }






}

