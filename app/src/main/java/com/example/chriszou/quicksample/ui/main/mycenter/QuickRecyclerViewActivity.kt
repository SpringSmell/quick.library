package com.example.chriszou.quicksample.ui.main.mycenter

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chriszou.quicksample.R
import kotlinx.android.synthetic.main.activity_quick_recycler_view.*
import org.quick.component.*
import org.quick.component.widget.QRecyclerView

class QuickRecyclerViewActivity : org.quick.library.b.BaseActivity() {

    override fun onResultLayoutResId(): Int = R.layout.activity_quick_recycler_view

    override fun onInit() {

    }

    override fun onInitLayout() {
//        quickRecyclerView.setLayoutManager(GridLayoutManager(activity, 2, OrientationHelper.VERTICAL, false))
//        quickRecyclerView.setLayoutManager(StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL))
        quickRecyclerView.setLayoutManager(LinearLayoutManager(this, RecyclerView.VERTICAL, false))
        quickRecyclerView.mAdapter = Adapter()
        quickRecyclerView.setupDividerLine(getDrawable(R.drawable.shape_app_divider_colorline_border), 40f)
        quickRecyclerView.getAdapter<Adapter>()?.setOnClickListener({ view, viewHolder, position, itemData ->
            quickRecyclerView.getAdapter<Adapter>()?.remove(position)
        }, R.id.delBtn)
        quickRecyclerView.setRefreshListener(true, true, object : QRecyclerView.OnRefreshListener {
            override fun onRefresh() {
                QuickToast.showToastDefault("开始刷新")
                QuickAsync.asyncDelay({
                    quickRecyclerView.refreshComplete()
                    quickRecyclerView?.notifyItemRangeChanged(0, 200)
                }, 2000)
            }

            override fun onLoading() {
                QuickToast.showToastDefault("开始加载")
                QuickAsync.asyncDelay({
                    quickRecyclerView.loadMoreComplete()
//                    quickRecyclerView.isNoMore = true
                    val tempDataList = arrayListOf<String>()
                    tempDataList.add("https://up.enterdesk.com/edpic_360_360/ce/f4/a5/cef4a5cd12d4dbdc29f85bc4631c5c35.jpg")
                    tempDataList.add("https://up.enterdesk.com/edpic_360_360/73/bd/10/73bd109d7301546b19dab0e2de593ecb.jpg")
                    tempDataList.add("https://up.enterdesk.com/edpic_360_360/f5/9b/62/f59b627e3aaaa494ca8f248a81a861df.jpg")
                    tempDataList.add("https://up.enterdesk.com/edpic_360_360/73/84/a8/7384a8726b81802b441e416f8c5fb578.jpg")
                    tempDataList.add("错误链接")
                    quickRecyclerView.getAdapter<Adapter>()?.addDataList(tempDataList)
                }, 3000)
            }

        })
    }

    override fun onBindListener() {

    }

    override fun start() {
        val tempDataList = arrayListOf<String>()
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/ce/f4/a5/cef4a5cd12d4dbdc29f85bc4631c5c35.jpg")
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/73/bd/10/73bd109d7301546b19dab0e2de593ecb.jpg")
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/f5/9b/62/f59b627e3aaaa494ca8f248a81a861df.jpg")
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/73/84/a8/7384a8726b81802b441e416f8c5fb578.jpg")
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/57/3e/4d/573e4d966410f05e89e399c9e7f50ff7.jpg")
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/72/cb/f8/72cbf87a181df269b95d25c652cd16b3.jpg")
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/49/84/2e/49842ec241511e2949a0b49111025997.jpg")
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/9a/1b/82/9a1b823144f817d0014f52a467bd9e5d.jpg")
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/93/28/be/9328bea7d0ce1783546e39978572fca3.jpg")
        tempDataList.add("https://up.enterdesk.com/edpic_360_360/28/69/2c/28692c85fe23a25f7109ceeb45b7ae82.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/29/db/6e/29db6e8f5a9c87438953284940762877.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/67/ef/01/67ef015cda467054c50f46f6325a213b.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/81/5b/bd/815bbd993860f47a8bff166445adc85d.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/40/1d/82/401d82455e2d2d83b0e891301b57d55a.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/ef/99/7d/ef997d7b1ab4774c2f6795cabb0d6996.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/e8/6c/1b/e86c1b74ec5d3cd9e32bb833c42bd920.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/e6/da/9f/e6da9f74915963c84ee7d5b0fa666c9f.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/06/1c/3a/061c3ac42f0ab4f699612057926d330b.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/24/9d/b9/249db9853430f0954e53ecb3f29d858d.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/c5/22/c4/c522c49496a315e7408439902887dbc4.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/33/52/95/335295727ee98f2158c3a810ca4e1d2f.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/49/54/af/4954af624f05e1e01cb93272904fddda.jpg")
//        tempDataList.addData("https://up.enterdesk.com/edpic_360_360/f4/f8/4f/f4f84ff78e2b01b2a466b4b721c81114.jpg")
        quickRecyclerView.getAdapter<Adapter>()?.setDataList(tempDataList)
        var temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
        temp.findViewById<TextView>(R.id.loadTv).text = "1"
        quickRecyclerView.addHeaderView(temp)
        temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
        temp.findViewById<TextView>(R.id.loadTv).text = "2"
        quickRecyclerView.addHeaderView(temp)
        temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
        temp.findViewById<TextView>(R.id.loadTv).text = "3"
        temp.setOnClickListener {
            quickRecyclerView.removeHeaderView(it)
        }
        quickRecyclerView.addHeaderView(temp)
        temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
        temp.findViewById<TextView>(R.id.loadTv).text = "4"
        temp.setOnClickListener {
            quickRecyclerView.removeHeaderView(it)
        }
        quickRecyclerView.addHeaderView(temp)
        temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
        temp.findViewById<TextView>(R.id.loadTv).text = "5"
        temp.setOnClickListener {
            quickRecyclerView.removeHeaderView(it)
        }
        quickRecyclerView.addHeaderView(temp)
        temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
        temp.findViewById<TextView>(R.id.loadTv).text = "6"
        quickRecyclerView.addHeaderView(temp)
        temp.setOnClickListener {
            quickRecyclerView.removeHeaderView(it)
        }
//
//        temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
//        temp.findViewById<TextView>(R.id.loadTv).text = "1"
//        quickRecyclerView.addFooterView(temp)
//        temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
//        temp.findViewById<TextView>(R.id.loadTv).text = "2"
//        quickRecyclerView.addFooterView(temp)
//        temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
//        temp.findViewById<TextView>(R.id.loadTv).text = "3"
//        quickRecyclerView.addFooterView(temp)
//        temp = LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null)
//        temp.findViewById<TextView>(R.id.loadTv).text = "4"
//        quickRecyclerView.addFooterView(temp)
//        quickRecyclerView.addHeaderView(LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null))
//        quickRecyclerView.addHeaderView(LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null))
//        quickRecyclerView.addHeaderView(LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null))
//        quickRecyclerView.addHeaderView(LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null))
//        quickRecyclerView.addFooterView(LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null))
//        quickRecyclerView.addFooterView(LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null))
//        quickRecyclerView.addFooterView(LayoutInflater.from(activity).inflate(R.layout.app_loading_more_view, null))

//        quickRecyclerView.getAdapter<DiscoverListFragment.Adapter>()?.notifyItemRangeChanged(0, quickRecyclerView.getAdapter<DiscoverListFragment.Adapter>()!!.itemCount)
        quickRecyclerView.getAdapter<Adapter>()?.setOnItemClickListener { view, viewHolder, position, itemData ->
            QuickToast.showToastDefault(position.toString())
            Log2.e(position.toString())
        }
    }

    class Adapter:QuickAdapter<String>(){
        override fun onResultItemResId(viewType: Int): Int =R.layout.item_discover_list

        override fun onBindData(holder: QuickViewHolder, position: Int, itemData: String, viewType: Int) {
            holder.setImg(R.id.contentIv, itemData)
        }
        override fun onResultItemMargin(position: Int): Float = 40f
    }
}