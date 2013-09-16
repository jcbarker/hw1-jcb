

/* First created by JCasGen Mon Sep 16 18:11:52 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** This contains the ranked list of top N answers, where N is the number of correct answers. This also records the precision (the number of correct answers in the list divided by the total number of answers in the list).
 * Updated by JCasGen Mon Sep 16 18:11:52 EDT 2013
 * XML source: /home/jon/workspace/hw1-jcb/src/main/resources/hw1-jcb-typesystem.xml
 * @generated */
public class Result extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Result.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Result() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Result(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Result(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Result(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets This is the number of correct answers in the N-best list divided by N.
   * @generated */
  public double getPrecision() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Result");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Result_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets This is the number of correct answers in the N-best list divided by N. 
   * @generated */
  public void setPrecision(double v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Result");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Result_Type)jcasType).casFeatCode_precision, v);}    
   
    
  //*--------------*
  //* Feature: scores

  /** getter for scores - gets This is the N-best list of answers.
   * @generated */
  public FSArray getScores() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_scores == null)
      jcasType.jcas.throwFeatMissing("scores", "Result");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_scores)));}
    
  /** setter for scores - sets This is the N-best list of answers. 
   * @generated */
  public void setScores(FSArray v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_scores == null)
      jcasType.jcas.throwFeatMissing("scores", "Result");
    jcasType.ll_cas.ll_setRefValue(addr, ((Result_Type)jcasType).casFeatCode_scores, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for scores - gets an indexed value - This is the N-best list of answers.
   * @generated */
  public AnswerScore getScores(int i) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_scores == null)
      jcasType.jcas.throwFeatMissing("scores", "Result");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_scores), i);
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_scores), i)));}

  /** indexed setter for scores - sets an indexed value - This is the N-best list of answers.
   * @generated */
  public void setScores(int i, AnswerScore v) { 
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_scores == null)
      jcasType.jcas.throwFeatMissing("scores", "Result");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_scores), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_scores), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    