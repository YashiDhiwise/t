package com.test_.app.modules.explore.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.test_.app.R
import com.test_.app.databinding.ActivityExploreBinding
import com.test_.app.modules.explore.`data`.model.Explore1RowModel
import com.test_.app.modules.explore.`data`.model.ExploreRowModel
import com.test_.app.modules.explore.`data`.viewmodel.ExploreVM
import com.test_.app.modules.notification.ui.NotificationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ExploreActivity : AppCompatActivity() {
  private lateinit var binding: ActivityExploreBinding

  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ExploreRowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Explore1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_explore)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : ExploreRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    val recyclerView1Adapter = RecyclerView1Adapter(arrayListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
            object : RecyclerView1Adapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : Explore1RowModel) {
                    onClickRecyclerView1(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.exploreVM = viewModel
    binding.image.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "EXPLORE_ACTIVITY"
  }
}
