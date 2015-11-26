package pl.mpolak.info_news.web.business.channel.boundary;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/channels")
public class ChannelController {

    @RequestMapping(method = RequestMethod.GET)
    public List<String> findAllChannels() {
        return Lists.newArrayList("channel_1", "channel_2", "channel_3");
    }

}
