package com.android.desl.androidstudy.android.downpic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.desl.androidstudy.R;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * 作者:追风小宝
 */
// 自定义设配器，还是一样继承baseadapter
//public class ShowPLAdapter extends BaseAdapter {
//    private LayoutInflater inflater;
//    private List goods;
//    private Bitmap mLoadingBitmap;
//    private Context context;
//    // 图片缓存技术的核心类，用于缓存所有下载好的图片，在程序内存达到设定值时会将最少最近使用的图片移除掉
//    private LruCache<String, BitmapDrawable> mMemoryCache;
//
//    //数据只需要个商品列表goods就够了
//    public ShowPLAdapter(Context context, List goods) {
//        super();
//        this.context = context;
//        this.goods = goods;
//        inflater = LayoutInflater.from(context);
//        //初始化默认的bitmap这里使用个颜色就可以了，可以用默认的空白图片也可
//        mLoadingBitmap = BitmapFactory.decodeResource(context.getResources(),
//                R.color.white);
//        // 这里获取应用程序最大可用内存
//        int maxMemory = (int) Runtime.getRuntime().maxMemory();
//        int cacheSize = maxMemory / 8;
//        // 将下载的图片保存着此缓存中
//        mMemoryCache = new LruCache<String, BitmapDrawable>(cacheSize) {
//            @Override
//            protected int sizeOf(String key, BitmapDrawable drawable) {
//                return drawable.getBitmap().getByteCount();
//            }
//        };
//    }
//
//    @Override
//    public int getCount() {
//        // TODO Auto-generated method stub
//        return goods.size();
//    }
//
//    @Override
//    public ProductDetailsBean getItem(int position) {
//        // TODO Auto-generated method stub
//        return goods.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        // TODO Auto-generated method stub
//        return position;
//    }
//
//    //adapter最重要的方法也在这里了
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ProductDetailsBean good = getItem(position);
//        // 通过商品获取加载图片地址
//        String url = good.getImagepath();
//        ViewHolder holder = null;
//        //如果没有缓存就解析xml加载控件
//        if (convertView == null) {
//            convertView = inflater.inflate(R.layout.search_goods_item, null);
//            holder = new ViewHolder();
//            holder.image = (ImageView) convertView.findViewById(R.id.img_search_good);
//            holder.description = (TextView) convertView.findViewById(R.id.tv_search_good_descp);
//            holder.pv = (TextView) convertView.findViewById(R.id.tv_search_good_pv);
//            holder.count = (TextView) convertView.findViewById(R.id.tv_search_good_count);
//            convertView.setTag(holder);
//        } else {
//            //如果缓存中有控件了，直接取出来
//            holder = (ViewHolder) convertView.getTag();
//        }
//        //设置商品值
//        String description = goods.get(position).getDecp();
//        String pv = goods.get(position).getPv();
//        String count = goods.get(position).getCount();
//        count = "兑换" + count + "次";
//        holder.description.setText(description);
//        holder.pv.setText(pv);
//        holder.count.setText(count);
//        //重要的就是图片了通过url获取BitmapDrawable
//        BitmapDrawable drawable = getBitmapFromMemoryCache(url);
//        if (drawable != null) {
//            //如果已经加载了就设置图片
//            holder.image.setImageDrawable(drawable);
//        } else if (cancelPotentialWork(url, holder.image)) {//未存在的潜在任务时，就使用启动异步加载
//            BitmapWorkerTask task = new BitmapWorkerTask(holder.image);
//            AsyncDrawable asyncDrawable = new AsyncDrawable(context.getResources(), mLoadingBitmap, task);
//            holder.image.setImageDrawable(asyncDrawable);
//            task.execute(url);
//        }
//        return convertView;
//    }
//
//    //自定义的一个Drawable，让这个Drawable持有BitmapWorkerTask的弱引用.
//    class AsyncDrawable extends BitmapDrawable {
//        private WeakReference<BitmapWorkerTask> bitmapWorkerTaskReference;
//
//        public AsyncDrawable(Resources res, Bitmap bitmap,
//                             BitmapWorkerTask bitmapWorkerTask) {
//            super(res, bitmap);
//            bitmapWorkerTaskReference = new WeakReference(
//                    bitmapWorkerTask);
//        }
//
//        public BitmapWorkerTask getBitmapWorkerTask() {
//            return bitmapWorkerTaskReference.get();
//        }
//    }
//
//    //获取传入的ImageView它所对应的BitmapWorkerTask。
//    private BitmapWorkerTask getBitmapWorkerTask(ImageView imageView) {
//        if (imageView != null) {
//            Drawable drawable = imageView.getDrawable();
//            if (drawable instanceof AsyncDrawable) {
//                AsyncDrawable asyncDrawable = (AsyncDrawable) drawable;
//                return asyncDrawable.getBitmapWorkerTask();
//            }
//        }
//        return null;
//    }
//
//    /**
//     * 取消掉后台的潜在任务，当认为当前ImageView存在着一个另外图片请求任务时
//     * ，则把它取消掉并返回true，否则返回false。
//     */
//    public boolean cancelPotentialWork(String url, ImageView imageView) {
//        BitmapWorkerTask bitmapWorkerTask = getBitmapWorkerTask(imageView);
//        if (bitmapWorkerTask != null) {
//            String imageUrl = bitmapWorkerTask.imageUrl;
//            if (imageUrl == null || !imageUrl.equals(url)) {
//                bitmapWorkerTask.cancel(true);
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    /**
//     * 将一张图片存储到LruCache中。
//     *
//     * @param key      LruCache的键，这里传入图片的URL地址。
//     * @param drawable LruCache的值，这里传入从网络上下载的BitmapDrawable对象。
//     */
//    public void addBitmapToMemoryCache(String key, BitmapDrawable drawable) {
//        if (getBitmapFromMemoryCache(key) == null) {
//            mMemoryCache.put(key, drawable);
//        }
//    }
//
//    /**
//     * 从LruCache中获取一张图片，如果不存在就返回null。
//     *
//     * @param key LruCache的键，这里传入图片的URL地址。
//     * @return 对应传入键的BitmapDrawable对象，或者null。
//     */
//    public BitmapDrawable getBitmapFromMemoryCache(String key) {
//        return mMemoryCache.get(key);
//    }
//
//}