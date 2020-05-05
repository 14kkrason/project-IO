using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;


/// <summary>
/// 
/// </summary>
public class Nagrywarka
{

  #region Attributes

  /// <summary>
  /// 
  /// </summary>
  public Baza_danych baza_nagran
  {
    get
    {
      return m_baza_nagran;
    }
    set
    {
      m_baza_nagran = value;
    }
  }
  private Baza_danych m_baza_nagran;


  /// <summary>
  /// 
  /// </summary>
  public Kalibracja kalibracja
  {
    get
    {
      return m_kalibracja;
    }
    set
    {
      m_kalibracja = value;
    }
  }
  private Kalibracja m_kalibracja;



  #endregion


  #region Public methods

  /// <summary>
  /// wstrzymuje nagrywanie
  /// </summary>
  /// <returns></returns>
  public void Pauza()
  {
    throw new Exception("The method or operation is not implemented.");
  }

  /// <summary>
  /// Ko�czy nagrywanie
  /// </summary>
  /// <returns></returns>
  public void Stop()
  {
    throw new Exception("The method or operation is not implemented.");
  }

  /// <summary>
  /// Usuwa nagranie o podanej nazwie
  /// </summary>
  /// <param name="nazwa"></param>
  /// <returns></returns>
  public void UsunNagranie(string nazwa)
  {
    throw new Exception("The method or operation is not implemented.");
  }

  /// <summary>
  /// Funkcja rozpoczynaj�ca nagrywanie oraz zwracaj�ca obiekt nagranie
  /// </summary>
  /// <param name="nazwa"></param>
  /// <param name="informacje"></param>
  /// <returns>Nagranie</returns>
  public Nagranie Nagraj(string nazwa, string informacje)
  {
    throw new Exception("The method or operation is not implemented.");
  }

  #endregion


  #region Protected methods

  #endregion


  #region Private methods

  #endregion


}

