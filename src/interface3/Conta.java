/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interface3;

/**
 *
 * @author T
 */
interface Conta {
  double getSaldo();
  void deposita(double valor);
  void retira(double valor);
  void atualiza(double taxaSelic);
}

