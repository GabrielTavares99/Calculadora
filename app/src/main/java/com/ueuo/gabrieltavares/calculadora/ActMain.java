package com.ueuo.gabrieltavares.calculadora;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActMain extends AppCompatActivity implements View.OnClickListener{

    private EditText txt_valor1, txt_valor2;
    private Button btn_soma,btn_subtracao,btn_divisao,btn_multiplicacao, btn_limpar, btn_igual;
    private Button btn_virgula,btn_num0,btn_num1,btn_num2,btn_num3,btn_num4,btn_num5,btn_num6,btn_num7,btn_num8,btn_num9;
    Double valor2=0.0,valor1=0.0;
    Double resultado = 0.0;
    String parcial = "";
    String visual = "";
    String operacao = "";
    boolean cont = true;
    Double temp=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        txt_valor1 = (TextView) findViewById(R.id.txt_Valor1);
        txt_valor2 = (TextView) findViewById(R.id.txt_Valor2);

        btn_soma = (Button) findViewById(R.id.btn_soma);
        btn_subtracao = (Button) findViewById(R.id.btn_subtracao);
        btn_divisao = (Button) findViewById(R.id.btn_divisao);
        btn_multiplicacao = (Button) findViewById(R.id.btn_multiplicacao);
        btn_limpar = (Button) findViewById(R.id.btn_Limpar);
        btn_igual = (Button) findViewById(R.id.btn_igualdade);

        btn_num0 = (Button) findViewById(R.id.btn_num0);
        btn_num1 = (Button) findViewById(R.id.btn_num1);
        btn_num2 = (Button) findViewById(R.id.btn_num2);
        btn_num3 = (Button) findViewById(R.id.btn_num3);
        btn_num4 = (Button) findViewById(R.id.btn_num4);
        btn_num5 = (Button) findViewById(R.id.btn_num5);
        btn_num6 = (Button) findViewById(R.id.btn_num6);
        btn_num7 = (Button) findViewById(R.id.btn_num7);
        btn_num8 = (Button) findViewById(R.id.btn_num8);
        btn_num9 = (Button) findViewById(R.id.btn_num9);
        btn_virgula = (Button) findViewById(R.id.btn_virgula);

        btn_num0.setOnClickListener(this);
        btn_num1.setOnClickListener(this);
        btn_num2.setOnClickListener(this);
        btn_num3.setOnClickListener(this);
        btn_num4.setOnClickListener(this);
        btn_num5.setOnClickListener(this);
        btn_num6.setOnClickListener(this);
        btn_num7.setOnClickListener(this);
        btn_num8.setOnClickListener(this);
        btn_num9.setOnClickListener(this);
        btn_virgula.setOnClickListener(this);

        btn_soma.setOnClickListener(this);
        btn_subtracao.setOnClickListener(this);
        btn_multiplicacao.setOnClickListener(this);
        btn_divisao.setOnClickListener(this);
        btn_limpar.setOnClickListener(this);
        btn_igual.setOnClickListener(this);

     //   resultado = Double.parseDouble(txt_valor2.getText().toString());


    }
    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btn_num0:
                coletarNumero(v);
                break;
            case R.id.btn_num1:
                coletarNumero(v);
                break;
            case R.id.btn_num2:
                coletarNumero(v);
                break;
            case R.id.btn_num3:
                coletarNumero(v);
             break;
            case R.id.btn_num4:
                coletarNumero(v);
                break;
            case R.id.btn_num5:
                coletarNumero(v);
                break;
            case R.id.btn_num6:
                coletarNumero(v);
                break;
            case R.id.btn_num7:
                coletarNumero(v);
                break;
            case R.id.btn_num8:
                coletarNumero(v);
                break;
            case R.id.btn_num9:
                coletarNumero(v);
                break;
            case R.id.btn_virgula:
                coletarNumero(v);
                break;
            case R.id.btn_soma:
                operacao = "+";
                colocarOperador(operacao);
                parcial = "";
                break;
            case R.id.btn_subtracao:
                operacao = "-";
                colocarOperador(operacao);
                parcial = "";
                break;
            case R.id.btn_multiplicacao:
                operacao = "*";
                colocarOperador(operacao);
                parcial = "";
                break;
            case R.id.btn_divisao:
                operacao = "/";
                colocarOperador(operacao);
                parcial = "";
                break;
            case R.id.btn_Limpar:
                parcial = "";
                resultado=0.0;
                parcial="";
                visual="";
                txt_valor1.setText("");
                txt_valor2.setText("");
                cont = true;
                break;
            case R.id.btn_igualdade:
                realizarCalculo(operacao);
                txt_valor2.setText(String.valueOf(resultado));
                break;
                default:
                    break;
        }

       // AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        //alertDialog.setMessage("O resultado é:"+ resultado);
      //  alertDialog.setNeutralButton("OK",null);
       // alertDialog.show();

       // if (limpar){
          //  txt_valor1.requestFocus();
        //}else {
          //      txt_valor2.setText("");
            //    txt_valor1.setText(String.valueOf(resultado));
        //}

    }

    public void realizarCalculo(String operacao){

        switch(operacao){
            case "+":
                resultado = resultado+Double.valueOf(parcial);
                break;
            case "-":
                resultado = resultado-Double.valueOf(parcial);
                break;
            case "*":
                resultado = resultado*Double.valueOf(parcial);
                break;
            case "/":
                resultado = resultado/Double.valueOf(parcial);
                break;
            default:
                break;
        }


    }

    public void coletarNumero(View vv){
        switch (vv.getId()) {
            case R.id.btn_num0:
            visual = visual + "0";
            parcial = parcial + "0";
                break;
            case R.id.btn_num1:
                visual = visual + "1";
                parcial = parcial + "1";
                break;
            case R.id.btn_num2:
                visual = visual + "2";
                parcial = parcial + "2";
                break;
            case R.id.btn_num3:
                visual = visual + "3";
                parcial = parcial + "3";
                break;
            case R.id.btn_num4:
                visual = visual + "4";
                parcial = parcial + "4";
                break;
            case R.id.btn_num5:
                visual = visual + "5";
                parcial = parcial + "5";
                break;
            case R.id.btn_num6:
                visual = visual + "6";
                parcial = parcial + "6";
                break;
            case R.id.btn_num7:
                visual = visual + "7";
                parcial = parcial + "7";
                break;
            case R.id.btn_num8:
                visual = visual + "8";
                parcial = parcial + "8";
                break;
            case R.id.btn_num9:
                visual = visual + "9";
                parcial = parcial + "9";
                break;
            case R.id.btn_virgula:
                visual = visual + ",";
                parcial = parcial+".";
                break;
        }
        txt_valor1.setText(visual);
        txt_valor2.setText(String.valueOf(resultado));

    }

    public void colocarOperador(String operacao){

        if (cont){
            resultado = Double.parseDouble(parcial);
            cont = false;
        }

        switch(operacao){
            case "+":
                visual= visual+"+";
                operacao="+";
                break;
            case "-":
                visual= visual+"-";
                operacao="-";
                break;
            case "*":
                visual= visual+"*";
                operacao="*";
                break;
            case "/":
                visual= visual+"/";
                operacao="/";
                break;
            default:
                break;
        }
        txt_valor1.setText(visual);
        txt_valor2.setText(String.valueOf(resultado));
        parcial="";
    }


}
