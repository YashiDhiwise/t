package com.test_.app.modules.notificationactivity.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationActivityRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtTransactionNik: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_nik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtCulpaCillumCo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtApril302014: String? =
      MyApp.getInstance().resources.getString(R.string.msg_april_30_2014)

)
