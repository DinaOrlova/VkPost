package domain.attachment.additional;

public class Preview {
    private PhotoForPreview photoForPreview;
    private GraffitiForPreview graffitiForPreview;
    private AudioMassage audioMassage;

    public PhotoForPreview getPhotoForPreview() {
        return photoForPreview;
    }

    public void setPhotoForPreview(PhotoForPreview photoForPreview) {
        this.photoForPreview = photoForPreview;
    }

    public GraffitiForPreview getGraffitiForPreview() {
        return graffitiForPreview;
    }

    public void setGraffitiForPreview(GraffitiForPreview graffitiForPreview) {
        this.graffitiForPreview = graffitiForPreview;
    }

    public AudioMassage getAudioMassage() {
        return audioMassage;
    }

    public void setAudioMassage(AudioMassage audioMassage) {
        this.audioMassage = audioMassage;
    }
}
