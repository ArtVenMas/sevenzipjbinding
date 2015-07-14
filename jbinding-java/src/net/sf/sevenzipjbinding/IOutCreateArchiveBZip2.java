package net.sf.sevenzipjbinding;

/**
 * The interface provides functionality to create new BZip2 archives.<br>
 * Standard way to get implementation is to use {@link SevenZip#openOutArchiveBZip2()}. See {@link IOutCreateArchive}
 * -JavaDoc for more information.
 * 
 * <i>NOTE:</i> Each instance should be closed using {@link IOutArchive#close()} method.
 * 
 * @see IOutCreateArchive
 * @see ArchiveFormat#BZIP2
 * @author Boris Brodski
 * @version 9.13-2.0
 */
public interface IOutCreateArchiveBZip2 extends IOutCreateArchive<OutItemBZip2>, //
        IOutFeatureSetLevel {
}
